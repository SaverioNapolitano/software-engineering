package com.saverionapolitano.designPatterns.decorator.pc;

public class Assembler {
	public static void main(String[] args) {
		Component notebook = new Notebook();
		notebook = new Ram(200, notebook);
		notebook = new Hd(100, notebook);
		notebook = new Ram(1, notebook);
		notebook = new Cpu(notebook);
		System.out.println(notebook.getDescription() + " " + notebook.cost());
	}
}
