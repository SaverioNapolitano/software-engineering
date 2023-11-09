package com.saverionapolitano.designPatterns.factory.vehicle;

public class EUPartsFactory implements PartsFactory{

	@Override
	public Body createBody() {
		return new EUBody();
	}

	@Override
	public Engine createEngine() {
		return new EUEngine();
	}

	@Override
	public Interior createInterior() {
		return new EUInterior();
	}
}
