package de.volkswagen.f73.adlis.ADLBackEnd.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ADLMongoRepo extends MongoRepository<String, Double> {

}
