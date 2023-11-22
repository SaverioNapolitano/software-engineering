package com.saverionapolitano.designPatterns.composite.park;

public abstract class Component {
	public void addParkingLot(Component component){
		throw new UnsupportedOperationException();
	}
	public void removeParkingLot(Component component){
		throw new UnsupportedOperationException();
	}
	public void printFreeParkingLots(){
		throw new UnsupportedOperationException();
	}
	public void takeParkingLot(){
		throw new UnsupportedOperationException();
	}

	public void leaveParkingLot(){
		throw new UnsupportedOperationException();
	}
}
