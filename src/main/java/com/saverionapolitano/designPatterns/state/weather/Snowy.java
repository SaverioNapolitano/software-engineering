package com.saverionapolitano.designPatterns.state.weather;

public class Snowy implements State{
	WeatherStation weatherStation;

	public Snowy(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}

	@Override
	public void update(int data) {
		if(data < 8){
			this.improve();
		}
		if(data == 8){
			this.worsen();
		}
	}

	@Override
	public void worsen() {
		weatherStation.setState(weatherStation.getRainy());
	}

	@Override
	public void improve() {
		weatherStation.setState(weatherStation.getCloudy());
	}

	@Override
	public String toString() {
		return "Snowy";
	}
}
