package com.saverionapolitano.designPatterns.strategy.videogame;

public class Simulator {
	public static void main(String[] args) {
		Character warrior = new Warrior(new LaserGunFightBehavior(), new InterstellarShipMoveBehavior());
		Character alien = new Alien(new PoisonousBlobFightBehaviour(), new TeleportMoveBehavior());

		warrior.fight();
		warrior.move();
		alien.move();

		warrior.setMoveBehavior(new SubsonicMotorcycleMoveBehavior());
		warrior.setFightBehavior(new PlasmaRifleFightBehavior());

		warrior.move();
		warrior.fight();
		alien.fight();

	}
}
