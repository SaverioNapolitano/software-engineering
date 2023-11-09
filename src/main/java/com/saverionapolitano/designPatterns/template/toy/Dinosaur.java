package com.saverionapolitano.designPatterns.template.toy;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Dinosaur extends ToyMakerTemplate{
	@Override
	void prepareMaterial() {
		System.out.println("Preparing dinosaur material");
	}

	@Override
	void meltMaterial() {
		System.out.println("Melting dinosaur material");
	}

	@Override
	void cutMaterial() {
		System.out.println("Cutting dinosaur material");
	}

	@Override
	void insertDeck() {
		RandomGenerator randomGenerator = RandomGenerator.getDefault();
		int deck = randomGenerator.nextInt(0, 10);
		if(deck == 0)
			System.out.println("Inserting deck");
		else
			System.out.println("Not inserting deck");
	}

	@Override
	void packageMaterial() {
		System.out.println("Packaging dinosaur material");
	}
}
