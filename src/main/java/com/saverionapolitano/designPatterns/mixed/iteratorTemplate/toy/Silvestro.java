package com.saverionapolitano.designPatterns.mixed.iteratorTemplate.toy;

public class Silvestro extends CatMixed{
	@Override
	void prepareMaterial() {
		System.out.println("Preparing Silvestro material");
	}

	@Override
	void meltMaterial() {
		System.out.println("Melting Silvestro material");
	}

	@Override
	void cutMaterial() {
		System.out.println("Cutting Silvestro material");
	}

	@Override
	void packageMaterial() {
		System.out.println("Packaging Silvestro material");
	}
}
