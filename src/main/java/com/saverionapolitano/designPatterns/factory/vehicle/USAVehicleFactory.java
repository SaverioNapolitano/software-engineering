package com.saverionapolitano.designPatterns.factory.vehicle;

public class USAVehicleFactory extends VehicleFactory {

	public USAVehicleFactory() {
		super(new USAPartsFactory());
	}

	@Override
	public Vehicle createVehicle() {
		return new USAVehicle(partsFactory);
	}
}
