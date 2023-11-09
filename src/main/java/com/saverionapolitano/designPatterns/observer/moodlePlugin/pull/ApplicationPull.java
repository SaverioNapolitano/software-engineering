package com.saverionapolitano.designPatterns.observer.moodlePlugin.pull;

public class ApplicationPull {
	public static void main(String[] args) {
		ProfessorPull war = new ProfessorPull("Frank War");
		ProfessorPull sigma = new ProfessorPull("The true sigma");
		ObserverPull saverio = new StudentPull("Saverio", "Napolitano", 0);
		ObserverPull salvatore = new StudentPull("Salvatore", "Esposito", 1);
		ObserverPull sigfrido = new StudentPull("Sigfrido", "Almonach", 2);
		war.addObserver(saverio);
		war.addObserver(salvatore);
		sigma.addObserver(sigfrido);
		war.publish("How to get a good grade in software engineering");
		sigma.publish("How to be a sigma");
	}
}
