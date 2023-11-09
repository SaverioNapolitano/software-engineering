package com.saverionapolitano.designPatterns.mixed.iteratorTemplate.toy;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Spinosaurus extends DinosaurMixed{
	@Override
	void prepareMaterial() {
		System.out.println("Preparing Spinosaurus material");
	}

	@Override
	void meltMaterial() {
		System.out.println("Melting Spinosaurus material");
	}

	@Override
	void cutMaterial() {
		System.out.println("Cutting Spinosaurus material");
	}

	@Override
	void insertDeck() {
		RandomGenerator randomGenerator = RandomGenerator.getDefault();
		int deck = randomGenerator.nextInt(0, 10);
		if(deck == 0)
			System.out.println("Inserting deck in Spinosaurus");
		else
			System.out.println("Not inserting deck in Spinosaurus");
	}

	@Override
	void packageMaterial() {
		System.out.println("Packaging Spinosaurus material");
	}
}
