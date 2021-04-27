package com.reactive.mausam.resource;

import com.reactive.mausam.service.CountryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.reactive.mausam.resource.ResourceConstants.COUNTRY;

@RestController
@RequestMapping(COUNTRY)
public class CountryResource {

    private final CountryService countryService;

    public CountryResource(CountryService countryService) {
        this.countryService = countryService;
    }
}
