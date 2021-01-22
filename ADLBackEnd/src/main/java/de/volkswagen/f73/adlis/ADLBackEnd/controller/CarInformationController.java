package de.volkswagen.f73.adlis.ADLBackEnd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import de.volkswagen.f73.adlis.ADLBackEnd.model.CarInformationEntity;
import de.volkswagen.f73.adlis.ADLBackEnd.repo.ADLMongoRepo;
import de.volkswagen.f73.adlis.ADLBackEnd.service.CarInformationService;

@RestController
public class CarInformationController {
	
	// FillerName für das Repo
	private CarInformationService carInformationService;
	
	@PostMapping("/")
	public CarInformationEntity newCarInformation() {
		return new CarInformationEntity("KrassesAuto", 23000, 15, 32);
	}
	
	@GetMapping("/")
	public CarInformationEntity getAllCarInformation() {
		return new CarInformationEntity("KrassesAuto", 23000, 15, 32);
	}
	
	@GetMapping("/toni")
	public void getTonisCarInformation() {
		System.out.println("HIer wollen wir die JSON reinkriegen");
	}
	
}
