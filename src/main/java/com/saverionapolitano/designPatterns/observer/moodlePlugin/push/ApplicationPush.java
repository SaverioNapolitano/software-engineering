package com.saverionapolitano.designPatterns.observer.moodlePlugin.push;

public class ApplicationPush {
	public static void main(String[] args) {
		ProfessorPush war = new ProfessorPush("Frank War");
		ProfessorPush sigma = new ProfessorPush("The true sigma");
		ObserverPush saverio = new StudentPush("Saverio", "Napolitano", 0, war);
		ObserverPush salvatore = new StudentPush("Salvatore", "Esposito", 1, war);
		ObserverPush sigfrido = new StudentPush("Sigfrido", "Almonach", 2, sigma);

		war.publish("How to get a good grade in software engineering");
		sigma.publish("How to be a sigma");
	}
}
