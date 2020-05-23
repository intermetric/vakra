package com.booking.vakra.house.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class House {

    private Integer houseNumber;
    private Integer capacity;
    private Double pricePerNight;
    private Double multiplier;

    public House(Integer houseNumber,
                 Integer capacity,
                 Double pricePerNight,
                 Double multiplier) {
        this.houseNumber = houseNumber;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.multiplier = multiplier;
    }

}
