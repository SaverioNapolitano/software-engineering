package com.saverionapolitano.designPatterns.factory.vehicle;

public class USAVehicle extends Vehicle {
	PartsFactory partsFactory;

	public USAVehicle(PartsFactory partsFactory) {
		this.partsFactory = partsFactory;
	}

	@Override
	public void assemble() {
		Body body = partsFactory.createBody();
		Engine engine = partsFactory.createEngine();
		Interior interior = partsFactory.createInterior();
		System.out.println(body.getDescription() + ", " + engine.getDescription() + ", " + interior.getDescription());
	}
}
