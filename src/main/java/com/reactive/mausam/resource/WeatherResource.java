package com.reactive.mausam.resource;

import com.reactive.mausam.mapper.WeatherMapper;
import com.reactive.mausam.model.api.WeatherApiDto;
import com.reactive.mausam.model.client.CityCodeWrapperDto;
import com.reactive.mausam.service.WeatherService;
import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

import java.util.List;

import static com.reactive.mausam.resource.ResourceConstants.WEATHER;

@RestController
@RequestMapping(WEATHER)
public class WeatherResource {
    WeatherService weatherService;

    public WeatherResource(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public Flux<WeatherApiDto> findAll() {
        return weatherService.findAll()
                .map(WeatherMapper::toApi);
                //.map(w -> ResponseEntity.ok(WeatherMapper.toApi(w)))
                //.defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<WeatherApiDto> create(@RequestBody @Valid WeatherApiDto weatherApiDto) {
        return weatherService.create(WeatherMapper.toEntity(weatherApiDto))
                .map(WeatherMapper::toApi);
    }

    @PostMapping(value = ResourceConstants.PATH_CITIES)
    public Flux<WeatherApiDto> findWeatherOfCities(@RequestBody CityCodeWrapperDto cityCodesDto) {
        return weatherService.findWeatherOfCities(cityCodesDto.getCityCodes()).map(WeatherMapper::toApi);
    }


}
