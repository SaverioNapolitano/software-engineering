package com.saverionapolitano.designPatterns.factory.vehicle;

public abstract class Interior extends Component{
	String string = "interior";

	@Override
	public String getDescription() {
		return string;
	}
}
