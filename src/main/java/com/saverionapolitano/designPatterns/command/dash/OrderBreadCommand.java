package com.saverionapolitano.designPatterns.command.dash;

public class OrderBreadCommand implements Command{
	Bread bread;

	public OrderBreadCommand(Bread bread) {
		this.bread = bread;
	}

	@Override
	public void execute() {
		bread.order();
	}
}
