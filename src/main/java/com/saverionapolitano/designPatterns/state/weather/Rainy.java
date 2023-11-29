package com.saverionapolitano.designPatterns.state.weather;

public class Rainy implements State{
	WeatherStation weatherStation;

	public Rainy(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}

	@Override
	public void update(int data) {
		if(data < 7) {
			this.improve();
		}
		if(data == 8){
			this.worsen();
		}
	}

	@Override
	public void worsen() {
		weatherStation.setState(weatherStation.getSnowy());
	}

	@Override
	public void improve() {
		weatherStation.setState(weatherStation.getCloudy());
	}

	@Override
	public String toString() {
		return "Rainy";
	}
}
