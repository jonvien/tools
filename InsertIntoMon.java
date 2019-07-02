package com.zjw.latest;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.alibaba.fastjson.JSONReader;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

public class InsertIntoMon {
	private static String json;

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException {
		
		json = "h:\\latest.json";
		
		JSONReader reader = new JSONReader(new FileReader(json));
		
		reader.startArray();

//		List<Map<String, String>> rsList = new ArrayList<Map<String, String>>();
		
//		Map<String, String> map = null;
		
		
		
		while (reader.hasNext()) {
			System.out.println("---开启数据库---");
			Mongo mongo = new Mongo("localhost",27017);
			DB db = mongo.getDB("wiki01");

			DBCollection collection = db.getCollection("latest");
			reader.startObject();
			BasicDBObject o = new BasicDBObject();
			
//			map = new HashMap<String, String>();
			while (reader.hasNext()) {
				
				String arrayListItemKey = reader.readString();
//				String arrayListItemKey = reader.readObject().toString();
				String arrayListItemValue = reader.readObject().toString();
//				map.put(arrayListItemKey, arrayListItemValue);	
//				System.out.println("arrayListItemKey***:"+arrayListItemKey+"*   *"+"arrayListItemValue***:"+arrayListItemValue+"************");
				System.out.println("***********************************正在进行");
				o.put(arrayListItemKey, arrayListItemValue);			
				
//				System.out.println("map*"+map);
			}
//			rsList.add(map);
			collection.insert(o);
			System.out.println("插入成功***********************************");
			mongo.close();
			System.out.println("---关闭数据库---");
			reader.endObject();
		}
		
		
		reader.endArray();
		reader.close();

	}
}
