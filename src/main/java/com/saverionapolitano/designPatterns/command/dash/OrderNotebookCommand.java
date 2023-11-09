package com.saverionapolitano.designPatterns.command.dash;

public class OrderNotebookCommand implements Command{
	Notebook notebook;

	public OrderNotebookCommand(Notebook notebook) {
		this.notebook = notebook;
	}

	@Override
	public void execute() {
		notebook.order();
	}
}
