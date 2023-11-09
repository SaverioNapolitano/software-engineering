package com.saverionapolitano.designPatterns.decorator.pc;

public class Desktop extends Component{
	String name = "Desktop";
	@Override
	public double cost() {
		return 1000;
	}

	@Override
	public String getDescription() {
		return name;
	}
}
