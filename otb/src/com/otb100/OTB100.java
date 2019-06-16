package com.otb100;

import java.util.Scanner;

public class OTB100 {

	private String[] strScenes = {"IV","OPR","SV","OCC","DEF","MB","FM","IPR","OV","BC","LR"};
	public static void main(String[] args) {
		System.out.print("输入:");
		Scanner scan = new Scanner(System.in);
		
		String mov = scan.next();
		System.out.println("输入数据："+mov); 
		switch (mov){
		case "Basketball":
			String[] Basketball= {"IV","OPR","OCC","DEF","BC"};
			new OTB100().change(Basketball);
			break;
		case "Biker":
			String[] Biker= {"OPR","SV","OCC","MB","FM","OV","LR"};
			new OTB100().change(Biker);
			break;
		case "Bird1":
			String[] Bird1= {"DEF","FM","OV"};
			new OTB100().change(Bird1);
			break;
		case "BlurBody":
			String[] BlurBody= {"SV","DEF","MB","FM","IPR"};
			new OTB100().change(BlurBody);
			break;
		case "BlurCar2":
			String[] BlurCar2= {"SV","MB","FM"};
			new OTB100().change(BlurCar2);
			break;
		case "BlurFace":
			String[] BlurFace= {"MB","FM","IPR"};
			new OTB100().change(BlurFace);
			break;
		case "BlurOwl":
			String[] BlurOwl= {"SV","MB","FM","IPR"};
			new OTB100().change(BlurOwl);
			break;
		case "Bolt":
			String[] Bolt= {"OPR","OCC","DEF","IPR"};
			new OTB100().change(Bolt);
			break;
		case "Box":
			String[] Box= {"IV","OPR","SV","OCC","MB","IPR","OV","BC"};
			new OTB100().change(Box);
			break;
		case "Car1":
			String[] Car1= {"IV","SV","BC","LR"};
			new OTB100().change(Car1);
			break;
		case "Car4":
			String[] Car4= {"IV","SV"};
			new OTB100().change(Car4);
			break;
		case "CarDark":
			String[] CarDark= {"IV","BC"};
			new OTB100().change(CarDark);
			break;
		case "CarScale":
			String[] CarScale= {"OPR","SV","OCC","FM","IPR"};
			new OTB100().change(CarScale);
			break;
		case "ClifBar":
			String[] ClifBar= {"SV","OCC","MB","FM","IPR","OV","BC"};
			new OTB100().change(ClifBar);
			break;
		case "Couple":
			String[] Couple= {"OPR","SV","DEF","FM","BC"};
			new OTB100().change(Couple);
			break;
		case "Crowds":
			String[] Crowds= {"IV","DEF","BC"};
			new OTB100().change(Crowds);
			break;
		case "David":
			String[] David= {"IV","OPR","SV","OCC","DEF","MB","IPR"};
			new OTB100().change(David);
			break;
		case "Deer":
			String[] Deer= {"MB","FM","IPR","BC"};
			new OTB100().change(Deer);
			break;
		case "Diving":
			String[] Diving= {"SV","DEF","IPR"};
			new OTB100().change(Diving);
			break;		
		case "DragonBody":
			String[] DragonBody= {"OPR","SV","OCC","MB","FM","IPR","OV"};
			new OTB100().change(DragonBody);
			break;
		case "Dudek":
			String[] Dudek= {"OPR","SV","OCC","DEF","FM","IPR","OV","BC"};
			new OTB100().change(Dudek);
			break;
		case "Football":
			String[] Football= {"OPR","OCC","IPR","BC"};
			new OTB100().change(Football);
			break;
		case "Freeman4":
			String[] Freeman4= {"OPR","SV","OCC","IPR","LR"};
			new OTB100().change(Freeman4);
			break;
		case "Girl":
			String[] Girl= {"OPR","SV","OCC","IPR"};
			new OTB100().change(Girl);
			break;
		case "Human3":
			String[] Human3= {"OPR","SV","OCC","DEF","BC"};
			new OTB100().change(Human3);
			break;
		case "Human4":
			String[] Human4= {"IV","SV","OCC","DEF"};
			new OTB100().change(Human4);
			break;
		case "Human6":
			String[] Human6= {"OPR","SV","OCC","DEF","FM","OV"};
			new OTB100().change(Human6);
			break;
		case "Human9":
			String[] Human9= {"IV","SV","DEF","MB","FM"};
			new OTB100().change(Human9);
			break;
		case "Ironman":
			String[] Ironman= {"IV","OPR","SV","OCC","MB","FM","IPR","OV","BC"};
			new OTB100().change(Ironman);
			break;
		case "Jump":
			String[] Jump= {"OPR","SV","OCC","DEF","MB","IPR"};
			new OTB100().change(Jump);
			break;
		case "Jumping":
			String[] Jumping= {"MB","FM"};
			new OTB100().change(Jumping);
			break;
		case "Liquor":
			String[] Liquor= {"IV","OPR","SV","OCC","MB","FM","OV","BC"};
			new OTB100().change(Liquor);
			break;
		case "Matrix":
			String[] Matrix= {"IV","OPR","SV","OCC","FM","IPR","BC"};
			new OTB100().change(Matrix);
			break;
		case "MotorRolling":
			String[] MotorRolling= {"IV","SV","MB","FM","IPR","BC"};
			new OTB100().change(MotorRolling);
			break;
		case "Panda":
			String[] Panda= {"OPR","SV","OCC","DEF","IPR","OV","LR"};
			new OTB100().change(Panda);
			break;
		case "RedTeam":
			String[] RedTeam= {"OPR","SV","OCC","IPR","LR"};
			new OTB100().change(RedTeam);
			break;
		case "Shaking":
			String[] Shaking= {"IV","OPR","SV","IPR","BC"};
			new OTB100().change(Shaking);
			break;
		case "Singer2":
			String[] Singer2= {"IV","OPR","DEF","IPR","BC"};
			new OTB100().change(Singer2);
			break;
		case "Skating1":
			String[] Skating1= {"IV","OPR","SV","OCC","DEF","BC"};
			new OTB100().change(Skating1);
			break;
		case "Skating2_1":
			String[] Skating2_1= {"OPR","SV","OCC","DEF","FM"};
			new OTB100().change(Skating2_1);
			break;
		case "Skating2_2":
			String[] Skating2_2= {"OPR","SV","OCC","DEF","FM"};
			new OTB100().change(Skating2_2);
			break;
		case "Skiing":
			String[] Skiing= {"IV","OPR","SV","DEF","IPR","LR"};
			new OTB100().change(Skiing);
			break;
		case "Soccer":
			String[] Soccer= {"IV","OPR","SV","OCC","MB","FM","IPR","BC"};
			new OTB100().change(Soccer);
			break;
		case "Surfer":
			String[] Surfer= {"OPR","SV","FM","IPR","LR"};
			new OTB100().change(Surfer);
			break;
		case "Sylvester":
			String[] Sylvester= {"IV","OPR","IPR"};
			new OTB100().change(Sylvester);
			break;
		case "Tiger2":
			String[] Tiger2= {"IV","OPR","OCC","DEF","MB","FM","IPR","OV"};
			new OTB100().change(Tiger2);
			break;
		case "Trellis":
			String[] Trellis= {"IV","OPR","SV","IPR","BC"};
			new OTB100().change(Trellis);
			break;
		case "Walking":
			String[] Walking= {"SV","OCC","DEF","LR"};
			new OTB100().change(Walking);
			break;
		case "Walking2":
			String[] Walking2= {"SV","OCC"};
			new OTB100().change(Walking2);
			break;
		case "Woman":
			String[] Woman= {"IV","OPR","SV","OCC","DEF","MB","FM"};
			new OTB100().change(Woman);
			break;
		case "Bird2":
			String[] Bird2= {"OPR","OCC","DEF","FM","IPR"};
			new OTB100().change(Bird2);
			break;
		case "BlurCar1":
			String[] BlurCar1= {"MB","FM"};
			new OTB100().change(BlurCar1);
			break;
		case "BlurCar3":
			String[] BlurCar3= {"MB","FM"};
			new OTB100().change(BlurCar3);
			break;
		case "BlurCar4":
			String[] BlurCar4= {"MB","FM"};
			new OTB100().change(BlurCar4);
			break;
		case "Board":
			String[] Board= {"OPR","SV","MB","FM","OV","BC"};
			new OTB100().change(Board);
			break;
		case "Bolt2":
			String[] Bolt2= {"DEF","BC"};
			new OTB100().change(Bolt2);
			break;
		case "Boy":
			String[] Boy= {"OPR","SV","MB","FM","IPR"};
			new OTB100().change(Boy);
			break;
		case "Car2":
			String[] Car2= {"IV","BC"};
			new OTB100().change(Car2);
			break;
		case "Car24":
			String[] Car24= {"IV","SV","BC"};
			new OTB100().change(Car24);
			break;
		case "Coke":
			String[] Coke= {"IV","OPR","OCC","FM","IPR"};
			new OTB100().change(Coke);
			break;
		case "Coupon":
			String[] Coupon= {"OCC","BC"};
			new OTB100().change(Coupon);
			break;
		case "Crossing":
			String[] Crossing= {"SV","DEF","BC"};
			new OTB100().change(Crossing);
			break;
		case "Dancer":
			String[] Dancer= {"OPR","SV","DEF","IPR"};
			new OTB100().change(Dancer);
			break;
		case "Dancer2":
			String[] Dancer2= {"DEF"};
			new OTB100().change(Dancer2);
			break;
		case "David2":
			String[] David2= {"OPR","IPR"};
			new OTB100().change(David2);
			break;
		case "David3":
			String[] David3= {"OPR","OCC","DEF","BC"};
			new OTB100().change(David3);
			break;
		case "Dog":
			String[] Dog= {"OPR","SV","DEF"};
			new OTB100().change(Dog);
			break;
		case "Dog1":
			String[] Dog1= {"OPR","SV","IPR"};
			new OTB100().change(Dog1);
			break;
		case "Doll":
			String[] Doll= {"IV","OPR","SV","OCC","IPR"};
			new OTB100().change(Doll);
			break;
		case "FaceOcc1":
			String[] FaceOcc1= {"OCC"};
			new OTB100().change(FaceOcc1);
			break;
		case "FaceOcc2":
			String[] FaceOcc2= {"IV","OPR","OCC","IPR"};
			new OTB100().change(FaceOcc2);
			break;
		case "Fish":
			String[] Fish= {"IV"};
			new OTB100().change(Fish);
			break;
		case "FleetFace":
			String[] FleetFace= {"OPR","SV","DEF","MB","FM","IPR"};
			new OTB100().change(FleetFace);
			break;
		case "Football1":
			String[] Football1= {"OPR","IPR","BC"};
			new OTB100().change(Football1);
			break;
		case "Freeman1":
			String[] Freeman1= {"OPR","SV","IPR"};
			new OTB100().change(Freeman1);
			break;
		case "Freeman3":
			String[] Freeman3= {"OPR","SV","IPR","LR"};
			new OTB100().change(Freeman3);
			break;
		case "Girl2":
			String[] Girl2= {"OPR","SV","OCC","DEF","MB"};
			new OTB100().change(Girl2);
			break;
		case "Gym":
			String[] Gym= {"OPR","SV","DEF","IPR"};
			new OTB100().change(Gym);
			break;
		case "Human2":
			String[] Human2= {"IV","OPR","SV","MB"};
			new OTB100().change(Human2);
			break;
		case "Human5":
			String[] Human5= {"SV","OCC","DEF"};
			new OTB100().change(Human5);
			break;
		case "Human7":
			String[] Human7= {"IV","SV","OCC","DEF","MB","FM"};
			new OTB100().change(Human7);
			break;
		case "Human8":
			String[] Human8= {"IV","SV","DEF"};
			new OTB100().change(Human8);
			break;
		case "Jogging_1":
			String[] Jogging_1= {"OPR","OCC","DEF"};
			new OTB100().change(Jogging_1);
			break;
		case "Jogging_2":
			String[] Jogging_2= {"OPR","OCC","DEF"};
			new OTB100().change(Jogging_2);
			break;
		case "KiteSurf":
			String[] KiteSurf= {"IV","OPR","OCC","IPR"};
			new OTB100().change(KiteSurf);
			break;
		case "Lemming":
			String[] Lemming= {"IV","OPR","SV","OCC","FM","OV"};
			new OTB100().change(Lemming);
			break;
		case "Man":
			String[] Man= {"IV"};
			new OTB100().change(Man);
			break;
		case "Mhyang":
			String[] Mhyang= {"IV","OPR","DEF","BC"};
			new OTB100().change(Mhyang);
			break;
		case "MountainBike":
			String[] MountainBike= {"OPR","IPR","BC"};
			new OTB100().change(MountainBike);
			break;
		case "Rubik":
			String[] Rubik= {"OPR","SV","OCC","IPR"};
			new OTB100().change(Rubik);
			break;
		case "Singer1":
			String[] Singer1= {"IV","OPR","SV","OCC"};
			new OTB100().change(Singer1);
			break;
		case "Skater":
			String[] Skater= {"OPR","SV","DEF","IPR"};
			new OTB100().change(Skater);
			break;
		case "Skater2":
			String[] Skater2= {"OPR","SV","DEF","FM","IPR"};
			new OTB100().change(Skater2);
			break;
		case "Subway":
			String[] Subway= {"OCC","DEF","BC"};
			new OTB100().change(Subway);
			break;
		case "Suv":
			String[] Suv= {"OCC","IPR","OV"};
			new OTB100().change(Suv);
			break;
		case "Tiger1":
			String[] Tiger1= {"IV","OPR","OCC","DEF","MB","FM","IPR"};
			new OTB100().change(Tiger1);
			break;
		case "Toy":
			String[] Toy= {"OPR","SV","FM","IPR"};
			new OTB100().change(Toy);
			break;
		case "Trans":
			String[] Trans= {"IV","SV","OCC","DEF"};
			new OTB100().change(Trans);
			break;
		case "Twinnings":
			String[] Twinnings= {"OPR","SV"};
			new OTB100().change(Twinnings);
			break;
		case "Vase":
			String[] Vase= {"SV","FM","IPR"};
			new OTB100().change(Vase);
			break;
			
			default: break;
		}
		
		
		
	}
	
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
		for(int i = 0;i<strScenes.length;i++){
			System.out.print(" "+strScenes[i]+" ");
		}
		return strScenes;
	}
	
	

}
