package com.reactive.mausam.repository;

import com.reactive.mausam.model.entity.Weather;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface WeatherRepository extends ReactiveMongoRepository<Weather, String> {
    Flux<Weather> findByCityIdIn(String[] cityCodes);
}
