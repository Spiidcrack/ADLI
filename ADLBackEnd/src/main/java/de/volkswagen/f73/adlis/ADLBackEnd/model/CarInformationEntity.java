package de.volkswagen.f73.adlis.ADLBackEnd.model;

import lombok.Data;

@Data
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

}
