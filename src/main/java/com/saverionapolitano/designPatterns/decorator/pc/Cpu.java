package com.saverionapolitano.designPatterns.decorator.pc;

public class Cpu extends ComponentDecorator{
	Component component;
	String name = "CPU";

	public Cpu(Component component) {
		super(component);
	}

	@Override
	public double cost() {
		return component.cost() + 100;
	}

	@Override
	public String getDescription() {
		return component.getDescription() + ", CPU";
	}
}
