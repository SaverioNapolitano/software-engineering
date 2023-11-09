package com.saverionapolitano.designPatterns.command.dash;

public class Notebook {
	int counter;

	public Notebook(int counter) {
		this.counter = counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public void order(){
		if(counter > 0) {
			counter--;
			System.out.println("Notebook ordered, " + counter + " notebooks left");
		}
		else
			throw new RuntimeException("We're out of notebooks");

	}
}
