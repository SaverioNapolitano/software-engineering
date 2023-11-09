package com.saverionapolitano.designPatterns.mixed.iteratorTemplate.toy;

public class Cat extends CatMixed{
	@Override
	void prepareMaterial() {
		System.out.println("Preparing Cat material");
	}

	@Override
	void meltMaterial() {
		System.out.println("Melting Cat material");
	}

	@Override
	void cutMaterial() {
		System.out.println("Cutting Cat material");
	}

	@Override
	void packageMaterial() {
		System.out.println("Packaging Cat material");
	}
}
