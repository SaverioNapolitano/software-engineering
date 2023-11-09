package com.saverionapolitano.designPatterns.factory.vehicle;

public class USABody extends Body{
	String string = "USA body";

	@Override
	public String getDescription() {
		return string;
	}
}
