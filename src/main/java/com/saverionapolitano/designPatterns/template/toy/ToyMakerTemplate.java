package com.saverionapolitano.designPatterns.template.toy;

public abstract class ToyMakerTemplate {
	final void createToy(){
		prepareMaterial();
		meltMaterial();
		cutMaterial();
		insertDeck();
		packageMaterial();
	}

	void prepareMaterial(){

	}

	void meltMaterial(){

	}
	void cutMaterial(){

	}

	void insertDeck(){

	}

	void packageMaterial(){

	}


}
