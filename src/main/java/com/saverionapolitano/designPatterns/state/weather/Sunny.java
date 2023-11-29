package com.saverionapolitano.designPatterns.state.weather;

public class Sunny implements State{
	WeatherStation weatherStation;

	public Sunny(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}

	@Override
	public void update(int data) {
		if(data < 5){
			this.worsen();
		}
	}

	@Override
	public void worsen() {
		weatherStation.setState(weatherStation.getCloudy());
	}

	@Override
	public void improve() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Sunny";
	}
}
