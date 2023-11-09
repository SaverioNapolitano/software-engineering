package com.saverionapolitano.designPatterns.strategy.videogame;

public class TeleportMoveBehavior implements MoveBehavior{
	@Override
	public void move() {
		System.out.println("I'm moving using teleport");
	}
}
