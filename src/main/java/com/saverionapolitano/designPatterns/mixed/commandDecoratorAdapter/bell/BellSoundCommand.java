package com.saverionapolitano.designPatterns.mixed.commandDecoratorAdapter.bell;

public class BellSoundCommand extends BellDecorator implements Command{

	public BellSoundCommand(Bell bell) {
		super(bell);
	}

	@Override
	public void execute() {
		System.out.println(bell.getSound());
	}

	@Override
	public String getSound() {
		return bell.getSound();
	}
}
