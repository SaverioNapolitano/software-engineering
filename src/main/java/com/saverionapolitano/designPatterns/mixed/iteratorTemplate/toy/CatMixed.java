package com.saverionapolitano.designPatterns.mixed.iteratorTemplate.toy;

public class CatMixed extends ToyMakerTemplateMixed {
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
