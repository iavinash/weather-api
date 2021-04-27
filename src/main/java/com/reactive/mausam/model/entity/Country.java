package com.reactive.mausam.model.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "COUNTRY_COL")
public class Country {

    @Id
    private String countryCode;

    private String countryName;

    //private List<City> cities = new ArrayList<>();


    public String getCountryCode() {
        return countryCode;
    }

    public Country setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getCountryName() {
        return countryName;
    }

    public Country setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return countryCode.equals(country.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("countryCode", countryCode)
                .append("countryName", countryName)
                .toString();
    }
}
