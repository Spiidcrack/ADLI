package de.volkswagen.f73.aldis.adlrecorder.model;

public class CarInformationEntity {

	private String fin;
	private double kilometers;
	private int fuelInPercent;
	private double temperature;

	public CarInformationEntity(String fin, double kilometers, int fuelInPercent, double temperature) {
		super();
		this.fin = fin;
		this.kilometers = kilometers;
		this.fuelInPercent = fuelInPercent;
		this.temperature = temperature;
	}

	public String getAsJson() {
		return "{\"fin\": \"" + this.getFin() + "\", \"kilometers\": \"" + this.getKilometers()
				+ "\", \"fuelInPercent\": \"" + this.getFuel() + "\", \"temperature\": \"" + this.getTemperature()
				+ "\"}";
	}

	public String getFin() {
		return this.fin;
	}

	public double getKilometers() {
		return this.kilometers;
	}

	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}

	public int getFuel() {
		return this.fuelInPercent;
	}

	public void setFuel(int fuel) {
		this.fuelInPercent = fuel;
	}

	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

}
