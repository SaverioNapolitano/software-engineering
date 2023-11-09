package com.saverionapolitano.designPatterns.mixed.commandDecoratorAdapter.bell;

public class BeatBellDecorator extends BellDecorator{

	public BeatBellDecorator(Bell bell) {
		super(bell);
	}

	@Override
	public String getSound() {
		return bell.getSound() + " " + "tic";
	}
}
