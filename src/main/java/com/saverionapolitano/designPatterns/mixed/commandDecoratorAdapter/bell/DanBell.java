package com.saverionapolitano.designPatterns.mixed.commandDecoratorAdapter.bell;

public class DanBell extends Bell{
	String sound = "dan";

	@Override
	public String getSound() {
		return sound;
	}
}
