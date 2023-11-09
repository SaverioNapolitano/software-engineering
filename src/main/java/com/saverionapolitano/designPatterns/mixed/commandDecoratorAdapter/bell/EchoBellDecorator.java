package com.saverionapolitano.designPatterns.mixed.commandDecoratorAdapter.bell;

public class EchoBellDecorator extends BellDecorator{

	public EchoBellDecorator(Bell bell) {
		super(bell);
	}

	@Override
	public String getSound() {
		return bell.getSound() + " " + bell.getSound();
	}
}
