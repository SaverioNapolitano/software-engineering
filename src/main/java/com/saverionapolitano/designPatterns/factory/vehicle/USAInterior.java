package com.saverionapolitano.designPatterns.factory.vehicle;

public class USAInterior extends Interior{
	String string = "USA interior";

	@Override
	public String getDescription() {
		return string;
	}
}
