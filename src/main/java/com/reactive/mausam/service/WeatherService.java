package com.reactive.mausam.service;

import com.reactive.mausam.model.entity.Weather;
import com.reactive.mausam.repository.WeatherRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

    private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);

    private final WeatherRepository weatherRepository;

    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public Flux<Weather> findAll() {
        return weatherRepository.findAll()
                .doOnSubscribe(s -> logger.debug("Searching countries...."))
                .doOnComplete(() -> logger.debug("Counties within {} retrieved."));
    }

    public Mono<Weather> create(Weather weather) {
        return weatherRepository.insert(weather)
                .doOnSubscribe(s -> logger.info("Creating {}", weather))
                .doOnNext(q -> logger.info("Created {}", q));

    }

    public Mono<Void> deleteAll() {
        return weatherRepository.deleteAll();
    }

    public Flux<Weather> findWeatherOfCities(String[] cityCodes) {
        return weatherRepository.findByCityIdIn(cityCodes);
    }
}
