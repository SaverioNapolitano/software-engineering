package com.saverionapolitano.designPatterns.mixed.commandDecoratorAdapter.bell;

public class DonBell extends Bell{
	String sound = "don";

	@Override
	public String getSound() {
		return sound;
	}
}
