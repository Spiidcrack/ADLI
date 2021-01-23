package de.volkswagen.f73.adlis.ADLBackEnd.service;

import org.springframework.stereotype.Component;

import de.volkswagen.f73.adlis.ADLBackEnd.model.CarInformationEntity;

@Component // <-- Added
public class CarInformationService {

	public void printCarInformation(CarInformationEntity car) {
		System.out.println(car.toString());
	}

}
