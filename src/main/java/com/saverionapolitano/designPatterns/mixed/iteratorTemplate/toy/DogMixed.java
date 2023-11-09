package com.saverionapolitano.designPatterns.mixed.iteratorTemplate.toy;

public class DogMixed extends ToyMakerTemplateMixed {
	@Override
	void prepareMaterial() {
		System.out.println("Preparing dog material");
	}

	@Override
	void meltMaterial() {
		System.out.println("Melting dog material");
	}

	@Override
	void cutMaterial() {
		System.out.println("Cutting dog material");
	}

	@Override
	void packageMaterial() {
		System.out.println("Packaging dog material");
	}
}
