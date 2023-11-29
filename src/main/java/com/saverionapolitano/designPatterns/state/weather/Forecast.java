package com.saverionapolitano.designPatterns.state.weather;

public class Forecast {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		for(int i = 0; i < 100; i++){
			weatherStation.update();
			System.out.println(weatherStation.getState());
		}
	}
}
