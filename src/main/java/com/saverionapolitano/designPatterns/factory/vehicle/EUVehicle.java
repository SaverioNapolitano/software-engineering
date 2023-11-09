package com.saverionapolitano.designPatterns.factory.vehicle;

public class EUVehicle extends Vehicle {
	PartsFactory partsFactory;

	public EUVehicle(PartsFactory partsFactory) {
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
