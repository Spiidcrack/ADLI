package de.volkswagen.f73.adlis.ADLBackEnd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import de.volkswagen.f73.adlis.ADLBackEnd.model.CarInformationEntity;
import de.volkswagen.f73.adlis.ADLBackEnd.repo.ADLMongoRepo;

@RestController
public class CarInformationController {
	
	// FillerName für das Repo
	private ADLMongoRepo repo;
	
	@PostMapping("/")
	public CarInformationEntity newCarInformation() {
		return new CarInformationEntity("KrassesAuto", 23000, 15, 32);
	}
	
	@GetMapping("/")
	public CarInformationEntity getAllCArInformation() {
		return new CarInformationEntity("KrassesAuto", 23000, 15, 32);
	}
	

}
