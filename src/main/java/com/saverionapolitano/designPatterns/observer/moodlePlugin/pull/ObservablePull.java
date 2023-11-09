package com.saverionapolitano.designPatterns.observer.moodlePlugin.pull;

public interface ObservablePull {
	void addObserver(ObserverPull observer);
	void removeObserver(ObserverPull observer);
	void notifyAllObservers();
}
