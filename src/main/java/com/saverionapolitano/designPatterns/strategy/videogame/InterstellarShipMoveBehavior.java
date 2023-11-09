package com.saverionapolitano.designPatterns.strategy.videogame;

public class InterstellarShipMoveBehavior implements MoveBehavior{
	@Override
	public void move() {
		System.out.println("I'm moving using an interstellar ship");
	}
}
