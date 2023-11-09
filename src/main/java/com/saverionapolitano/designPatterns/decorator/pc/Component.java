package com.saverionapolitano.designPatterns.decorator.pc;

public abstract class Component {
	String name = "Unknown component";
	public String getDescription(){
		return name;
	}

	public abstract double cost();
}
