package com.saverionapolitano.designPatterns.factory.vehicle;

public abstract class VehicleFactory {
	PartsFactory partsFactory;

	public VehicleFactory(PartsFactory partsFactory) {
		this.partsFactory = partsFactory;
	}

	public abstract Vehicle createVehicle();
}
