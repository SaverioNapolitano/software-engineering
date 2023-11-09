package com.saverionapolitano.designPatterns.mixed.iteratorTemplate.toy;

public class Tom extends CatMixed{
	@Override
	void prepareMaterial() {
		System.out.println("Preparing Tom material");
	}

	@Override
	void meltMaterial() {
		System.out.println("Melting Tom material");
	}

	@Override
	void cutMaterial() {
		System.out.println("Cutting Tom material");
	}

	@Override
	void packageMaterial() {
		System.out.println("Packaging Tom material");
	}
}
