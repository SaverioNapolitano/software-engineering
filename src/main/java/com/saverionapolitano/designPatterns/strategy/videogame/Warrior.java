package com.saverionapolitano.designPatterns.strategy.videogame;

public class Warrior extends Character{

	public Warrior(FightBehavior fightBehavior, MoveBehavior moveBehavior) {
		super(fightBehavior, moveBehavior);
	}
}
