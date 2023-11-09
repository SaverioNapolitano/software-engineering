package com.saverionapolitano.designPatterns.mixed.iteratorTemplate.toy;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Triceratops extends DinosaurMixed{
	@Override
	void prepareMaterial() {
		System.out.println("Preparing Triceratops material");
	}

	@Override
	void meltMaterial() {
		System.out.println("Melting Triceratops material");
	}

	@Override
	void cutMaterial() {
		System.out.println("Cutting Triceratops material");
	}

	@Override
	void insertDeck() {
		RandomGenerator randomGenerator = RandomGenerator.getDefault();
		int deck = randomGenerator.nextInt(0, 10);
		if(deck == 0)
			System.out.println("Inserting deck in Triceratops");
		else
			System.out.println("Not inserting deck in Triceratops");
	}

	@Override
	void packageMaterial() {
		System.out.println("Packaging Triceratops material");
	}
}
