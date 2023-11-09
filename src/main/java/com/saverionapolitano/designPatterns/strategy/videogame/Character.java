package com.saverionapolitano.designPatterns.strategy.videogame;

public abstract class Character {
	//TODO costruttore
	FightBehavior fightBehavior;
	MoveBehavior moveBehavior;

	public Character(FightBehavior fightBehavior, MoveBehavior moveBehavior) {
		this.fightBehavior = fightBehavior;
		this.moveBehavior = moveBehavior;
	}
	void move(){
		moveBehavior.move();
	}
	void fight(){
		fightBehavior.fight();
	}

	public void setFightBehavior(FightBehavior fightBehavior) {
		this.fightBehavior = fightBehavior;
	}

	public void setMoveBehavior(MoveBehavior moveBehavior) {
		this.moveBehavior = moveBehavior;
	}
}
