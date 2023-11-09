package com.saverionapolitano.designPatterns.strategy.videogame;

public class Alien extends Character{

	public Alien(FightBehavior fightBehavior, MoveBehavior moveBehavior) {
		super(fightBehavior, moveBehavior);
	}
}
