package com.booking.vakra.house.dao;

import com.booking.vakra.house.model.House;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("houseRepositoryPostgres")
public class HouseRepositoryImpl implements HouseRepository {

    private List<House> houses = new ArrayList<>();

    @Override
    public Integer addHouse(House house) {
        houses.add(house);
        return 1;
    }

    @Override
    public House getHouseByNumber(Integer houseNumber) {
        return null;
    }

    @Override
    public List<House> getAllHouses() {
        return houses;
    }
}
