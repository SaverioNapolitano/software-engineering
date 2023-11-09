package com.saverionapolitano.designPatterns.template.toy;

public class Simulator {
	public static void main(String[] args) {
		ToyMakerTemplate cat = new Cat();
		ToyMakerTemplate dog = new Dog();
		ToyMakerTemplate dinosaur = new Dinosaur();
		ToyFactory plasticFactory = new ToyFactory(cat, "plastic");
		ToyFactory rubberFactory = new ToyFactory(dog, "obtained from plants rubber");
		plasticFactory.makeToy();
		rubberFactory.makeToy();
		dinosaur.createToy();
	}
}
