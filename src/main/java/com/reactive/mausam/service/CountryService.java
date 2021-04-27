package com.reactive.mausam.service;

import com.reactive.mausam.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
}
