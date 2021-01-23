package de.volkswagen.f73.aldis.adlrecorder.application;

import de.volkswagen.f73.aldis.adlrecorder.model.CarInformationEntity;

public class CarSimulator {

	static int drivenKilometers;

	public static CarInformationEntity getCurrentValues(CarInformationEntity car) {
		car = generateKilometers(car);
		car = generateNewFuel(car);
		car = getNewTemperature(car);
		return car;
	}

	private static CarInformationEntity generateKilometers(CarInformationEntity car) {
		drivenKilometers = (int) Math.round(10 * (Math.random() * (7 - 1 + 1)) + 1) / 10;
		car.setKilometers(car.getKilometers() + drivenKilometers);
		return car;
	}

	private static CarInformationEntity generateNewFuel(CarInformationEntity car) {
		if (car.getFuel() < 5) {
			car.setFuel(100);
		} else {
			car.setFuel(car.getFuel() - drivenKilometers / 2);
		}
		return car;
	}

	private static CarInformationEntity getNewTemperature(CarInformationEntity car) {
		car.setTemperature(Math.round(10 * (Math.random() * (26 - 18 + 1) + 18)) / 10);
		return car;
	}
}
