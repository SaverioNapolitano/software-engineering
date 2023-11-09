package com.saverionapolitano.designPatterns.command.dash;

public class ButtonMaker {
	public static void main(String[] args) {
		OrderBreadCommand orderBreadCommand = new OrderBreadCommand(new Bread());
		OrderNotebookCommand orderNotebookCommand = new OrderNotebookCommand(new Notebook(10));
		Dash breadButton = new Dash(orderBreadCommand);
		Dash notebookButton = new Dash(orderNotebookCommand);
		breadButton.buttonPressed();
		notebookButton.buttonPressed();
	}
}
