package com.otb100;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelWrite {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		File xlsFile = new File("jxl.xls");
		WritableWorkbook workbook = Workbook.createWorkbook(xlsFile);
		WritableSheet sheet = workbook.createSheet("sheet1", 0);
		
		Change ch = new Change();
//		String[] CarScale= {"OPR","SV","OCC","FM","IPR"};
//		for(int i=0;i<ch.change(CarScale).length;i++){
//			System.out.println("CarScale"+ch.change(CarScale)[i]);
//		}
		String[] ClifBar= {"SV","OCC","MB","FM","IPR","OV","BC"};
		for(int i=0;i<ch.change(ClifBar).length;i++){
			System.out.println("ClifBar"+ch.change(ClifBar)[i]);
		}
		List<String[]> listMov = new ArrayList<String[]>();
		
		
//		listMov.add(ch.change(CarScale));
//		listMov.add(ch.change(ClifBar));
		
//		for (int i = 0; i < listMov.size(); i++) {
//			String[] str = listMov.get(i);
//			System.out.println(i+":");
//			for(int j=0;j<str.length;j++){
//				System.out.print(str[j]+" ");
//			}
//			
//		}
//		otb100.change(ClifBar);
		
//		for (int row = 0; row < 2; row++) {
//			for (int col = 0; col < 11; col++) {
//				// 向工作表中添加数据
//				sheet.addCell(new Label(col, row, ch.change(ClifBar)[col]));
//				
//			}
//		}
		
		workbook.write();
		workbook.close();

	}

}
