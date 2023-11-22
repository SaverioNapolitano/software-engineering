package com.saverionapolitano.designPatterns.composite.park;

public class Garage {
	public static void main(String[] args) {
		Area garage = new Area("Saverio's garage", "The best garage");
		Area area = new Area("Frank War's area", "Average area");
		Area subArea = new Area("Subarea 1", "Subarea 1");
		Area subarea2 = new Area("Subarea 2", "Subarea 2");
		area.addParkingLot(subArea);
		area.addParkingLot(subarea2);
		Area area2 = new Area("Area 2", "Area 2");
		Area subArea3 = new Area("SubArea 3", "Subarea 3");
		Area subArea4 = new Area("Subarea 4", "Subarea 4");
		area2.addParkingLot(subArea3);
		area2.addParkingLot(subArea4);
		Area area3 = new Area("Area 3", "Area 3");
		Area subArea5 = new Area("Subarea 5", "Subarea 5");
		Area subArea6 = new Area("Subarea 6", "Subarea 6");
		area3.addParkingLot(subArea5);
		area3.addParkingLot(subArea6);
		garage.addParkingLot(area);
		garage.addParkingLot(area2);
		garage.addParkingLot(area3);
		for(int i = 0; i < 10; i++){
			Component parkingLot = new ParkingLot(i, i*5, true);
			subarea2.addParkingLot(parkingLot);
			if(i%2==0){
				parkingLot.takeParkingLot();
			}
		}
		for(int i = 10; i < 20; i++){
			Component parkingLot = new ParkingLot(i, i*5, true);
			subArea5.addParkingLot(parkingLot);
			if(i%2==0){
				parkingLot.takeParkingLot();
			}
		}
		garage.printFreeParkingLots();
	}



}
