package com.saverionapolitano.designPatterns.factory.vehicle;

public abstract class Body extends Component{
	String string = "body";

	@Override
	public String getDescription() {
		return string;
	}
}
