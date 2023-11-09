package com.saverionapolitano.designPatterns.factory.vehicle;

public abstract class Engine extends Component{
	String string = "engine";

	@Override
	public String getDescription() {
		return string;
	}
}
