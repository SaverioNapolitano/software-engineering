package com.saverionapolitano.designPatterns.state.weather;

import java.util.random.RandomGenerator;

public class WeatherStation {
	State cloudy;
	State rainy;
	State sunny;
	State snowy;
	State state;

	public WeatherStation() {
		cloudy = new Cloudy(this);
		rainy = new Rainy(this);
		sunny = new Sunny(this);
		snowy = new Snowy(this);
		state = sunny;
	}

	public State getSnowy() {
		return snowy;
	}

	public void setSnowy(State snowy) {
		this.snowy = snowy;
	}

	public State getCloudy() {
		return cloudy;
	}

	public void setCloudy(State cloudy) {
		this.cloudy = cloudy;
	}

	public State getRainy() {
		return rainy;
	}

	public void setRainy(State rainy) {
		this.rainy = rainy;
	}

	public State getSunny() {
		return sunny;
	}

	public void setSunny(State sunny) {
		this.sunny = sunny;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void update(){
		RandomGenerator randomGenerator = RandomGenerator.getDefault();
		int data = randomGenerator.nextInt(10);
		state.update(data);
	}
}
