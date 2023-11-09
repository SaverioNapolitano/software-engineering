package com.saverionapolitano.designPatterns.decorator.pc;

public abstract class ComponentDecorator extends Component{
	Component component;

	public ComponentDecorator(Component component) {
		this.component = component;
	}

	public abstract String getDescription();
	public abstract double cost();
}
