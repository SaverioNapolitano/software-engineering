package com.saverionapolitano.designPatterns.observer.moodlePlugin.push;

import java.util.ArrayList;

public class ProfessorPush implements ObservablePush {
	ArrayList<ObserverPush> observers;

	String name;

	String material;

	public String getName() {
		return name;
	}

	public void publish(String material) {
		this.material = material;
		notifyAllObservers();
	}

	public ProfessorPush(String name) {
		observers = new ArrayList<>();
		this.name = name;
	}

	@Override
	public void addObserver(ObserverPush observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(ObserverPush observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObservers() {
		for (ObserverPush observer:
		observers) {
			observer.update(material);
		}
	}
}
