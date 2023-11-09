package com.saverionapolitano.designPatterns.factory.vehicle;

public class USAPartsFactory implements PartsFactory{
	@Override
	public Body createBody() {
		return new USABody();
	}

	@Override
	public Engine createEngine() {
		return new USAEngine();
	}

	@Override
	public Interior createInterior() {
		return new USAInterior();
	}
}
