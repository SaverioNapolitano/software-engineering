package com.saverionapolitano.designPatterns.mixed.commandDecoratorAdapter.bell;

public class WindBellDecorator extends BellDecorator{

	public WindBellDecorator(Bell bell) {
		super(bell);
	}

	@Override
	public String getSound() {
		return bell.getSound() + " " + "fffff";
	}
}
