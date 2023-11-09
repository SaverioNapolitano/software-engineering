package com.saverionapolitano.designPatterns.command.dash;

public class Bread {
	String bread;

	public Bread() {
		bread = "Bread is cooking";
	}

	public void order(){
		System.out.println(bread);
	}
}
