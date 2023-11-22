package com.saverionapolitano.designPatterns.composite.park;

public class ParkingLot extends Component{
	int number;
	int dimension;
	boolean free;

	public ParkingLot(int number, int dimension, boolean free) {
		this.number = number;
		this.dimension = dimension;
		this.free = free;
	}

	@Override
	public void printFreeParkingLots() {
		if(free){
			System.out.println(this);
		}
	}

	@Override
	public String toString() {
		return "ParkingLot{" +
				"number=" + number +
				", dimension=" + dimension +
				", free=" + free +
				'}';
	}

	@Override
	public void leaveParkingLot() {
		free = true;
	}

	@Override
	public void takeParkingLot() {
		free = false;
	}
}
