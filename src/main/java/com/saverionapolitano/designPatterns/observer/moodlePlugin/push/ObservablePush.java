package com.saverionapolitano.designPatterns.observer.moodlePlugin.push;

public interface ObservablePush {
	void addObserver(ObserverPush observer);
	void removeObserver(ObserverPush observer);
	void notifyAllObservers();

}
