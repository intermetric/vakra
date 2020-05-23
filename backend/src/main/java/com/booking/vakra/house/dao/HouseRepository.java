package com.booking.vakra.house.dao;

import com.booking.vakra.house.model.House;

import java.util.List;

public interface HouseRepository {
    Integer addHouse(House house);

    House getHouseByNumber(Integer houseNumber);

    List<House> getAllHouses();
}
