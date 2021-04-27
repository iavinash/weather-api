package com.reactive.mausam.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

@Document(collection = "WEATHER_COL")
public class Weather {

    @Id
    @Field("_id")
    @JsonIgnore
    private String id;

    @Indexed(unique = true)
    private String cityId;

    private long temperature;

    private String unit;

    private String desc;

    public String getId() {
        return id;
    }

    public Weather setId(String id) {
        this.id = id;
        return this;
    }

    public String getCityId() {
        return cityId;
    }

    public Weather setCityId(String cityId) {
        this.cityId = cityId;
        return this;
    }

    public long getTemperature() {
        return temperature;
    }

    public Weather setTemperature(long temperature) {
        this.temperature = temperature;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public Weather setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Weather setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weather)) return false;
        Weather weather = (Weather) o;
        return id.equals(weather.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("cityId", cityId)
                .append("temperature", temperature)
                .append("unit", unit)
                .append("desc", desc)
                .toString();
    }
}
