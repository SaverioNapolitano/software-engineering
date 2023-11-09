package com.saverionapolitano.designPatterns.factory.vehicle;

public class Application {
	public static void main(String[] args) {
		VehicleFactory euVehicleFactory = new EUVehicleFactory();
		Vehicle euVehicle = euVehicleFactory.createVehicle();
		euVehicle.assemble();
		VehicleFactory usaVehicleFactory = new USAVehicleFactory();
		Vehicle usaVehicle = usaVehicleFactory.createVehicle();
		usaVehicle.assemble();
	}
}
