package com.saverionapolitano.designPatterns.decorator.pc;

public class Notebook extends Component{
	String name = "Notebook";
	@Override
	public double cost() {
		return 500;
	}

	@Override
	public String getDescription() {
		return name;
	}
}
