package com.saverionapolitano.designPatterns.factory.vehicle;

public class EUEngine extends Engine{
	String string = "EU engine";

	@Override
	public String getDescription() {
		return string;
	}
}
