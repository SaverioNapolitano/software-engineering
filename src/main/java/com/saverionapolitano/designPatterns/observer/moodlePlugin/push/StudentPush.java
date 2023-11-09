package com.saverionapolitano.designPatterns.observer.moodlePlugin.push;

public class StudentPush implements ObserverPush, DisplayElementPush {
	String name;
	String surname;
	int matr;

	String material;

	ProfessorPush professor;

	public StudentPush(String name, String surname, int matr, ProfessorPush professor) {
		this.name = name;
		this.surname = surname;
		this.matr = matr;
		this.professor = professor;
		professor.addObserver(this);
	}

	@Override
	public void update(String material) {
		this.material = material;
		display();
	}

	@Override
	public void display() {
		System.out.println("Student " + name + " " + surname + " matr " + matr + ": " + material + " has been " +
				"published on " +
				"Moodle by " + professor.getName());
	}
}
