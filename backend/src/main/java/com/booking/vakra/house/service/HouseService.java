package com.booking.vakra.house.service;

import com.booking.vakra.house.dao.HouseRepository;
import com.booking.vakra.house.model.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {
    private final HouseRepository houseDao;

    @Autowired
    public HouseService(@Qualifier("houseRepositoryPostgres") HouseRepository houseDao) {
        this.houseDao = houseDao;
    }

    public void addHouse(House house) {
        Integer result = houseDao.addHouse(house);
    }

    public List<House> getAllHouses() {
        return houseDao.getAllHouses();
    }
}
