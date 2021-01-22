package de.volkswagen.f73.adlis.ADLBackEnd.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.volkswagen.f73.adlis.ADLBackEnd.model.CarInformationEntity;

public interface ADLMongoRepo extends MongoRepository<CarInformationEntity, Long> {

	
	
}
