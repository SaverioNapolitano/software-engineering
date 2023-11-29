package com.saverionapolitano.designPatterns.state.weather;

public interface State {
	void update(int data);
	void worsen();
	void improve();
}
