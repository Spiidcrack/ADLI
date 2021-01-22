package de.volkswagen.f73.adlis.ADLBackEnd.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
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

	
}
