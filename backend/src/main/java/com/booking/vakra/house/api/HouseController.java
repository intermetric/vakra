package com.booking.vakra.house.api;

import com.booking.vakra.house.model.House;
import com.booking.vakra.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/house")
public class HouseController {

    private final HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @PostMapping(value = "/save")
    public void addHouse(
            @RequestParam(value = "houseNumber", required = true) Integer houseNumber,
            @RequestParam(value = "capacity", required = true) Integer capacity,
            @RequestParam(value = "pricePerNight", required = true) Double pricePerNight,
            @RequestParam(value = "multiplier", required = true) Double multiplier
    ) {
        houseService.addHouse(new House(houseNumber, capacity, pricePerNight, multiplier));
    }

    @GetMapping(value = "")
    public List<House> getHouses() {
        return houseService.getAllHouses();
    }
}
