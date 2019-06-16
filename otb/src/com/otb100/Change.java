package com.otb100;

public class Change {
	String[] strScenes = { "IV", "OPR", "SV", "OCC", "DEF", "MB", "FM", "IPR", "OV", "BC", "LR" };
	public String[] change(String[] mov) {
		for (int j = 0; j < mov.length; j++) {
			for (int i = 0; i < strScenes.length; i++) {
				if (mov[j].equals(strScenes[i])) {
					strScenes[i] = "1";
				}

			}
		}
		for(int i = 0;i<strScenes.length;i++){
			if(!strScenes[i].equals("1")){
				strScenes[i] = "0";
			}
		}
//		for(int i = 0;i<strScenes.length;i++){
//			System.out.print(" "+strScenes[i]+" ");
//		}
		return strScenes;
	}
}
