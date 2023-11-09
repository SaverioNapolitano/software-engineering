package com.saverionapolitano.designPatterns.observer.moodlePlugin.pull;

import java.util.ArrayList;

public class ProfessorPull implements ObservablePull{
	ArrayList<ObserverPull> observers;

	String name;

	String material;

	public String getName() {
		return name;
	}

	public void publish(String material) {
		this.material = material;
		notifyAllObservers();
	}

	public String getMaterial() {
		return material;
	}

	public ProfessorPull(String name) {
		observers = new ArrayList<>();
		this.name = name;
	}

	@Override
	public void addObserver(ObserverPull observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(ObserverPull observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObservers() {
		for (ObserverPull observer:
				observers) {
			observer.update(this);
		}
	}
}
