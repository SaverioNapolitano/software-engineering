package com.saverionapolitano.designPatterns.template.toy;

public class Cat extends ToyMakerTemplate{
	@Override
	void prepareMaterial() {
		System.out.println("Preparing cat material");
	}

	@Override
	void meltMaterial() {
		System.out.println("Melting cat material");
	}

	@Override
	void cutMaterial() {
		System.out.println("Cutting cat material");
	}

	@Override
	void packageMaterial() {
		System.out.println("Packaging cat material");
	}
}
