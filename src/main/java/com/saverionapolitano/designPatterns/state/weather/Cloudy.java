package com.saverionapolitano.designPatterns.state.weather;

public class Cloudy implements State{
	WeatherStation weatherStation;

	public Cloudy(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}

	@Override
	public void update(int data) {
		if(data < 3){
			this.improve();
		} else if(data > 4){
			this.worsen();
		}
	}

	@Override
	public void worsen() {
		weatherStation.setState(weatherStation.getRainy());
	}

	@Override
	public void improve() {
		weatherStation.setState(weatherStation.getSunny());
	}

	@Override
	public String toString() {
		return "Cloudy";
	}
}
