package com.saverionapolitano.designPatterns.composite.park;

import java.util.ArrayList;

public class Area extends Component{

	String name;

	String description;
	ArrayList<Component> components;

	public Area(String name, String description) {
		this.name = name;
		this.description = description;
		components = new ArrayList<>();
	}

	@Override
	public void addParkingLot(Component component) {
		components.add(component);
	}

	@Override
	public void removeParkingLot(Component component) {
		components.remove(component);
	}

	@Override
	public void printFreeParkingLots() {
		System.out.println(this);
		for (Component component : components) {
			if(component instanceof Area){
				System.out.println();
			}
			component.printFreeParkingLots();
		}
	}

	@Override
	public String toString() {
		return "Area{" +
				"name='" + name + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
