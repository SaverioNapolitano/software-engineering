package com.saverionapolitano.designPatterns.mixed.commandDecoratorAdapter.bell;

public abstract class BellDecorator extends Bell{
	Bell bell;

	public BellDecorator(Bell bell) {
		this.bell = bell;
	}

	public abstract String getSound();
}
