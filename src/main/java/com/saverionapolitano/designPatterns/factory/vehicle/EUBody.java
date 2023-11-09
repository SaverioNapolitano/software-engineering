package com.saverionapolitano.designPatterns.factory.vehicle;

public class EUBody extends Body{
	String string = "EU body";

	@Override
	public String getDescription() {
		return string;
	}
}
