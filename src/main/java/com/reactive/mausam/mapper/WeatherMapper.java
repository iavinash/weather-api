package com.reactive.mausam.mapper;

import com.reactive.mausam.model.api.WeatherApiDto;
import com.reactive.mausam.model.entity.Weather;

public class WeatherMapper {

    public WeatherMapper() {
    }

    public static WeatherApiDto toApi(Weather input) {
        return new WeatherApiDto()//.withId(input.getId().toString())
                .setCityId(input.getCityId())
                .setTemperature(input.getTemperature())
                .setUnit(input.getUnit())
                .setDesc(input.getDesc());
    }

    public static Weather toEntity(WeatherApiDto input) {
        return new Weather()//.withId(toObjectId(input.getId()))
                .setCityId(input.getCityId())
                .setTemperature(input.getTemperature())
                .setUnit(input.getUnit())
                .setDesc(input.getDesc());
    }
}
