package com.saverionapolitano.designPatterns.strategy.videogame;

public class LaserGunFightBehavior implements FightBehavior{
	@Override
	public void fight() {
		System.out.println("I'm fighting with a laser gun");
	}
}
