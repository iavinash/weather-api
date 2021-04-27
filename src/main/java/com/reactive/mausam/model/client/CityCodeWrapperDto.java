package com.reactive.mausam.model.client;

public class CityCodeWrapperDto {
    private String[] cityCodes;

    public String[] getCityCodes() {
        return cityCodes;
    }

    public CityCodeWrapperDto setCityCodes(String[] cityCodes) {
        this.cityCodes = cityCodes;
        return this;
    }
}
