package com.saverionapolitano.designPatterns.factory.vehicle;

public class USAEngine extends Engine{
	String string = "USA engine";

	@Override
	public String getDescription() {
		return string;
	}
}
