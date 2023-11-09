package com.saverionapolitano.designPatterns.observer.moodlePlugin.pull;

import com.saverionapolitano.designPatterns.observer.moodlePlugin.push.ObservablePush;

public class StudentPull implements ObserverPull, DisplayElementPull {
	String name;
	String surname;
	int matr;

	String material;

	public StudentPull(String name, String surname, int matr) {
		this.name = name;
		this.surname = surname;
		this.matr = matr;
	}

	@Override
	public void display(ObservablePull observable) {
		if(observable instanceof ProfessorPull prof) {
			System.out.println("Student " + name + " " + surname + " matr " + matr + ": " + material + " has been " +
					"published on " +
					"Moodle by " + prof.getName());
		}
	}

	@Override
	public void update(ObservablePull observable) {
		if(observable instanceof ProfessorPull prof) {
			material = prof.getMaterial();
		}
		display(observable);
	}
}
