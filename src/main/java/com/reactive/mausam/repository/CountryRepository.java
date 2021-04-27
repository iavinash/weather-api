package com.reactive.mausam.repository;

import com.reactive.mausam.model.entity.Country;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CountryRepository extends ReactiveMongoRepository<Country, String> {
}
