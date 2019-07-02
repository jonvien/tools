package com.zjw.latest;

import java.io.FileReader;
import java.io.StringReader;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.management.Query;

import org.bson.types.ObjectId;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.Bytes;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.util.JSON;

public class DataBase {
	private static String dx;
	private static DBObject  siteLinks;

	public static void main(String[] args) 
		throws UnknownHostException, MongoException {
		//1.建立一个Mongo的数据库连接对象
		Mongo mg = new Mongo("127.0.0.1:27017");
        //查询所有的Database
        for (String name : mg.getDatabaseNames()) {
            System.out.println("dbName: " + name);
        }
        //2.创建相关数据库的连接
        DB db = mg.getDB("wiki");
        //查询数据库所有的集合
        for (String name : db.getCollectionNames()) {
            System.out.println("collectionName: " + name);
        }
        
        DBCollection latest = db.getCollection("latest");
        String id = "Q31";
        //查询所有的数据
        DBObject keys = new BasicDBObject();
        
        keys.put("_id", false);
//		keys.put("type", true);
//      keys.put("id", true);
//      keys.put("labels", true);
//		keys.put("descriptions", true);
//		keys.put("aliases", true);
//		keys.put("claims", true);
//		keys.put("sitelinks", true);
       

//        System.out.println("find _id = 5ceb6712a595c5087025f0b2: " + users.find(new BasicDBObject("_id", new ObjectId("5ceb6712a595c5087025f0b2"))).toArray());
//        System.out.println("find id = Q31: " + users.find(new BasicDBObject("id", "Q31")).toArray());
//        System.out.println("只查询id属性：" + latest.find(null, new BasicDBObject("id", true)).toArray());
        /**
         * 循环插入数据
         */
        List<DBObject> idList = latest.find(null, new BasicDBObject("id", true)).toArray();
        String[] arrId = new String[idList.size()];
        for (int i = 0; i < idList.size(); i++) {
        	arrId[i] = (String) idList.get(i).get("id");
		}
//        String[] list = {"labels","descriptions","aliases","claims","sitelinks"};// labels (descriptions)  [aliases claims] sitelinks
//        String[] list = {"labels","descriptions","sitelinks"};
        String[] list = {"aliases","claims"};
        int count =0;
        while(count < list.length){
        
        for (int i = 0; i < arrId.length; i++) {
//        	System.out.println("ARRID:"+arrId[i]);
        	siteLinks = latest.findOne(new BasicDBObject("id", arrId[i]), new BasicDBObject(list[count], true));
//        	System.out.println("findOne: " + latest.findOne(new BasicDBObject("id",arrId[i]), new BasicDBObject("sitelinks", true)));
        	 siteLinks = latest.findOne(new BasicDBObject("id", arrId[i]), new BasicDBObject(list[count], true));
             DBCollection sitelink = db.getCollection(list[count]);
             Map map = siteLinks.toMap();
             Iterator entries = map.entrySet().iterator(); 
             while (entries.hasNext()) { 
                 Map.Entry entry = (Map.Entry) entries.next(); 
       			if (entry.getValue() instanceof ObjectId) {
       				String key = (String) entry.getKey();
       				ObjectId value = (ObjectId) entry.getValue();
//       				System.out.println("Key = " + key + ", Value = " + value);
       			}else{
       				String key = (String) entry.getKey();
       				String value = (String) entry.getValue();
//       				System.out.println("Key = " + key + ", Value = " + value);
       				JSONReader reader = new JSONReader(new StringReader(value));
       				
       				reader.startObject();
       				while (reader.hasNext()){
       					
       					String arrayListItemKey = reader.readString();

       					String arrayListItemValue = reader.readObject().toString();

//       					System.out.print(" key " + arrayListItemKey);
//       
//       					System.out.print(" value " + arrayListItemValue);
//						JSONReader reader1 = new JSONReader(new StringReader(arrayListItemValue));//正常json

       					
//       				数组型json
       					JSONObject arrListItemVal = new JSONObject();
						JSONArray jsonArray = JSONArray.parseArray(arrayListItemValue);
							for (Object obj : jsonArray) {

								arrListItemVal = (JSONObject) obj;
								
								System.out.println(arrListItemVal.getString("language"));
								System.out.println(arrListItemVal);

						}
						JSONReader reader1 = new JSONReader(new StringReader(arrListItemVal.toJSONString()));
						//
       					reader1.startObject();
       					String arrayListItemKey1 = "";
       					String arrayListItemValue1 = "";
       					BasicDBObject o = new BasicDBObject();
       					while (reader1.hasNext()){
       						
       						arrayListItemKey1 = reader1.readString();

       						arrayListItemValue1 = reader1.readObject().toString();
       						
       						System.out.print(" key1 " + arrayListItemKey1);
       //
//       						System.out.print(" value1 " + arrayListItemValue1);
       						
       						o.put("id", arrId[i]);
       						o.put(arrayListItemKey1, arrayListItemValue1);
       						
       						
       					}
       					
       					sitelink.insert(o);
       					
       				}
       				
       				reader.endObject();
//       				String str = "{\"a\":\"b\",\"c\":\"d\"}";
//       				JSONObject a = new JSONObject(str);
//       				List<String> list = new ArrayList<String>();  
//       				list.add("badges");  
//       				list.add("site");  
//       				list.add("title");  
//       				JSONArray array = new JSONArray();  
//       				array.add(list);     
       				
       				
       				
       			}
                 
                 
               }
		}
    	count++;
        }
        
        
        
//        System.out.println("只查属性：" + users.find(null,new BasicDBObject("id", true), 0, 2).toArray());
//        System.out.println("只查属性：" + users.find(null, new BasicDBObject("id", true), 0, 2, Bytes.QUERYOPTION_NOTIMEOUT).toArray());
        
      //只查询一条数据，多条去第一条
//        System.out.println("findOne: " + users.findOne());
//        System.out.println("findOne: " + users.findOne(new BasicDBObject("id", "Q31")));
//        System.out.println("findOne: " + users.findOne(new BasicDBObject("id", "Q31"), new BasicDBObject("labels", true))); //descriptions  aliases claims sitelinks
//        System.out.println("findOne: " + users.findOne(new BasicDBObject("id", "Q31"), new BasicDBObject("descriptions", true)));
//        System.out.println("findOne: " + users.findOne(new BasicDBObject("id", "Q31"), new BasicDBObject("aliases", true)));
//        System.out.println("findOne: " + users.findOne(new BasicDBObject("id", "Q31"), new BasicDBObject("claims", true)));
//        System.out.println("findOne: " + users.findOne(new BasicDBObject("id", "Q31"), new BasicDBObject("sitelinks", true)));
       /**
        * 单个id插入
        */
////        siteLinks = latest.findOne(new BasicDBObject("id", id), new BasicDBObject("aliases", true));
////        DBCollection sitelink = db.getCollection("aliases");
////
////        Map map = siteLinks.toMap();
//////        System.out.println(map);
////        Iterator entries = map.entrySet().iterator(); 
////        while (entries.hasNext()) { 
////          Map.Entry entry = (Map.Entry) entries.next(); 
////			if (entry.getValue() instanceof ObjectId) {
////				String key = (String) entry.getKey();
////				ObjectId value = (ObjectId) entry.getValue();
//////				System.out.println("Key = " + key + ", Value = " + value);
////			}else{
////				String key = (String) entry.getKey();
////				String value = (String) entry.getValue();
//////				System.out.println("Key = " + key + ", Value = " + value);
//////				System.out.println("valueLength()->"+value.length());
////				JSONReader reader = new JSONReader(new StringReader(value));
////				reader.startArray();
////				while (reader.hasNext()){
////					
////					String arrayListItemKey = reader.readString();
////
////					String arrayListItemValue = reader.readObject().toString();
////
//////					System.out.print(" key " + arrayListItemKey);
//////
//////					System.out.print(" value " + arrayListItemValue);
////					JSONReader reader1 = new JSONReader(new StringReader(arrayListItemValue));
////					reader1.startObject();
////					String arrayListItemKey1 = "";
////					String arrayListItemValue1 = "";
////					BasicDBObject o = new BasicDBObject();
////					while (reader1.hasNext()){
////						
////						arrayListItemKey1 = reader1.readString();
////
////						arrayListItemValue1 = reader1.readObject().toString();
////						
////						System.out.print(" key1 " + arrayListItemKey1);
////
////						System.out.print(" value1 " + arrayListItemValue1);
////						
////						o.put("id", id);
////						o.put(arrayListItemKey1, arrayListItemValue1);
////						
////						
////					}
////					
////					sitelink.insert(o);
////					
////				}
//				
//				reader.endObject();
//				String str = "{\"a\":\"b\",\"c\":\"d\"}";
//				JSONObject a = new JSONObject(str);
//				List<String> list = new ArrayList<String>();  
//				list.add("badges");  
//				list.add("site");  
//				list.add("title");  
//				JSONArray array = new JSONArray();  
//				array.add(list);     
//				
//				
//				
//			}
//          
//          
//        }
        
        
//        System.out.println(siteLinks );
//        siteLinks.put("siteLinks", true);
//        System.out.println(siteLinks.get("acewiki"));
        
        
        DBCursor cur = latest.find(null, keys);
//        DBCursor cur = users.find(null, siteLinks);
        while (cur.hasNext()) {
        	DBObject object = cur.next();
//        	System.out.println(object.get("fawikivoyage"));
        }
//        System.out.println(cur.count());
//        System.out.println(cur.getCursorId());
//        dx = JSON.serialize(cur);
//        System.out.println(JSON.serialize(cur));
        mg.close();
    }
}
