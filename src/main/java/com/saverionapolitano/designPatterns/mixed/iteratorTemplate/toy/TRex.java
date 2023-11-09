package com.saverionapolitano.designPatterns.mixed.iteratorTemplate.toy;

import java.util.Random;
import java.util.random.RandomGenerator;

public class TRex extends DinosaurMixed{
	@Override
	void prepareMaterial() {
		System.out.println("Preparing T-Rex material");
	}

	@Override
	void meltMaterial() {
		System.out.println("Melting T-Rex material");
	}

	@Override
	void cutMaterial() {
		System.out.println("Cutting T-Rex material");
	}

	@Override
	void insertDeck() {
		RandomGenerator randomGenerator = RandomGenerator.getDefault();
		int deck = randomGenerator.nextInt(0, 10);
		if(deck == 0)
			System.out.println("Inserting deck in T-Rex");
		else
			System.out.println("Not inserting deck in T-Rex");
	}

	@Override
	void packageMaterial() {
		System.out.println("Packaging T-Rex material");
	}
}
