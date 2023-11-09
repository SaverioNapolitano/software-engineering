package com.saverionapolitano.designPatterns.decorator.pc;

public class Hd extends ComponentDecorator{
	String name = "HD";
	double dimension;

	public Hd(double dimension, Component component) {
		super(component);
		this.dimension = dimension;
	}

	@Override
	public double cost() {
		return component.cost() + 20*dimension;
	}

	@Override
	public String getDescription() {
		return component.getDescription() + ", HD";
	}
}
