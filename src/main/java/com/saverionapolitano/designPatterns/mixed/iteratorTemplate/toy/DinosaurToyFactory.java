package com.saverionapolitano.designPatterns.mixed.iteratorTemplate.toy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.random.RandomGenerator;

public class DinosaurToyFactory implements Iterable<ToyMakerTemplateMixed>{
	ArrayList<ToyMakerTemplateMixed> toyMakerTemplates = new ArrayList<>();
	String toyMaterial;

	public DinosaurToyFactory(String toyMaterial) {
		ArrayList<DinosaurMixed> dinosaurMixeds = new ArrayList<>(List.of(new Spinosaurus(), new TRex(),
				new Triceratops()));
		for(int i = 0; i < 100; i++){
			RandomGenerator randomGenerator = RandomGenerator.getDefault();
			int index = randomGenerator.nextInt(0, 3);
			toyMakerTemplates.add(dinosaurMixeds.get(index));
		}
		this.toyMaterial = toyMaterial;
	}

	void makeToy(int index){
		System.out.println(toyMaterial + " toy");
		toyMakerTemplates.get(index).createToy();
	}

	@Override
	public Iterator<ToyMakerTemplateMixed> iterator() {
		return toyMakerTemplates.iterator();
	}
}
