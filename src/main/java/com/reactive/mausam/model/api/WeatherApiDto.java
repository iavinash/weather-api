package com.reactive.mausam.model.api;

public class WeatherApiDto {

    private String id;

    private String cityId;

    private long temperature;

    private String unit;

    private String desc;

    public String getId() {
        return id;
    }

    public WeatherApiDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getCityId() {
        return cityId;
    }

    public WeatherApiDto setCityId(String cityId) {
        this.cityId = cityId;
        return this;
    }

    public long getTemperature() {
        return temperature;
    }

    public WeatherApiDto setTemperature(long temperature) {
        this.temperature = temperature;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public WeatherApiDto setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public WeatherApiDto setDesc(String desc) {
        this.desc = desc;
        return this;
    }
}
