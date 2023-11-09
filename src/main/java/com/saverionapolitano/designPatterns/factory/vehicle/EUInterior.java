package com.saverionapolitano.designPatterns.factory.vehicle;

public class EUInterior extends Interior{
	String string = "EU interior";

	@Override
	public String getDescription() {
		return string;
	}
}
