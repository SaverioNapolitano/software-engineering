package com.saverionapolitano.designPatterns.mixed.commandDecoratorAdapter.bell;

public class BellBeepAdapter extends Beep{
	Bell bell;

	public BellBeepAdapter(Bell bell) {
		this.bell = bell;
	}

	@Override
	public String getBeep() {
		return bell.getSound();
	}
}
