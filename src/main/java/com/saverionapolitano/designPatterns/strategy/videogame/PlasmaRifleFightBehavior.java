package com.saverionapolitano.designPatterns.strategy.videogame;

public class PlasmaRifleFightBehavior implements FightBehavior{
	@Override
	public void fight() {
		System.out.println("I'm fighting with a plasma rifle");
	}
}
