package de.volkswagen.f73.adlis.ADLBackEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.volkswagen.f73.adlis.ADLBackEnd.model.CarInformationEntity;
import de.volkswagen.f73.adlis.ADLBackEnd.service.CarInformationService;

@RestController
@RequestMapping(value = "/post")
public class ADLBackendPostApi {

	@Autowired // <-- Addet
	private CarInformationService carInformationService;

	@PostMapping
	public CarInformationEntity newCarInformation(@RequestBody CarInformationEntity carInformation) {
		this.carInformationService.printCarInformation(carInformation);
		System.out.println("ES IST ANGEKOMMEN!");
		return carInformation;
	}
}
