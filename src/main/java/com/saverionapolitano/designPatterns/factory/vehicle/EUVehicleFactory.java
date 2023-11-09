package com.saverionapolitano.designPatterns.factory.vehicle;

public class EUVehicleFactory extends VehicleFactory {
	public EUVehicleFactory() {
		super(new EUPartsFactory());
	}

	@Override
	public Vehicle createVehicle() {
		return new EUVehicle(partsFactory);
	}
}
