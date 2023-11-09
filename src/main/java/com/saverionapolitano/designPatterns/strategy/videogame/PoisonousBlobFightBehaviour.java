package com.saverionapolitano.designPatterns.strategy.videogame;

public class PoisonousBlobFightBehaviour implements FightBehavior{
	@Override
	public void fight() {
		System.out.println("I'm fighting with a poisonous blob");
	}
}
