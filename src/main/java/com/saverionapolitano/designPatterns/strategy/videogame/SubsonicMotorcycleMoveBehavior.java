package com.saverionapolitano.designPatterns.strategy.videogame;

public class SubsonicMotorcycleMoveBehavior implements MoveBehavior{
	@Override
	public void move() {
		System.out.println("I'm moving using a subsonic motorcycle");
	}
}
