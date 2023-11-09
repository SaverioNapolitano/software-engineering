package com.saverionapolitano.designPatterns.command.dash;

public class Dash {
	Command command;

	public Dash(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void buttonPressed(){
		command.execute();
	}
}
