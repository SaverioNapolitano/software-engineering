package com.saverionapolitano.designPatterns.decorator.pc;

public class Ram extends ComponentDecorator{
	String name = "RAM";
	double dimension;

	public Ram(double dimension, Component component) {
		super(component);
		this.dimension = dimension;
	}

	@Override
	public double cost() {
		return component.cost() + 30*dimension;
	}

	@Override
	public String getDescription() {
		return component.getDescription() + ", RAM";
	}
}
