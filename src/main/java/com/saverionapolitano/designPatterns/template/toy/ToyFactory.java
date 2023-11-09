package com.saverionapolitano.designPatterns.template.toy;

public class ToyFactory {
	ToyMakerTemplate toyMakerTemplate;
	String toyMaterial;

	public ToyFactory(ToyMakerTemplate toyMakerTemplate, String toyMaterial) {
		this.toyMakerTemplate = toyMakerTemplate;
		this.toyMaterial = toyMaterial;
	}

	void makeToy(){
		System.out.println(toyMaterial + " toy");
		toyMakerTemplate.createToy();
	}
}
