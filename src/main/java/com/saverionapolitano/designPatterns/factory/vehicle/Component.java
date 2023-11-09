package com.saverionapolitano.designPatterns.factory.vehicle;

public abstract class Component {
	String string = "Unknown component";
	public String getDescription(){
		return string;
	}

}
