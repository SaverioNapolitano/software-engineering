package com.saverionapolitano.designPatterns.mixed.commandDecoratorAdapter.bell;

public class DinBell extends Bell{
	String sound = "din";

	@Override
	public String getSound() {
		return sound;
	}
}
