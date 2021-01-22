package de.volkswagen.f73.adlis.ADLBackEnd.model;

public class CarInformationEntity {
	
	private String fin;
	private double kilometers;
	private double fuel;
	private double temperature;
	
	public CarInformationEntity(String fin, double kilometers, double fuel, double temperature) {
		super();
		this.fin = fin;
		this.kilometers = kilometers;
		this.fuel = fuel;
		this.temperature = temperature;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public double getKilometers() {
		return kilometers;
	}

	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
}
