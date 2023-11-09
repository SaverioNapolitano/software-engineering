package com.saverionapolitano.designPatterns.mixed.iteratorTemplate.toy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SimulatorMixed {
	public static void main(String[] args) {
		DinosaurToyFactory dinosaurFactory = new DinosaurToyFactory("Plastic");
		CatToyFactory catFactory = new CatToyFactory("Plastic");
		Iterator<ToyMakerTemplateMixed> dinosaurIterator = dinosaurFactory.iterator();
		for (ToyMakerTemplateMixed cat : catFactory.getToyMakerTemplates()) {
			ToyMakerTemplateMixed dinosaur = dinosaurIterator.next();
			dinosaur.createToy();
			System.out.println("-----------------");
			cat.createToy();
			System.out.println("-----------------");
		}
	}
}
