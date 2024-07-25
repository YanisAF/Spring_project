package com.example.exo5.service;

import com.example.exo5.models.Furniture;

import java.util.List;
import java.util.UUID;

public interface FurnitureService {

    void addFurniture(Furniture furniture);

    void saveFurniture(Furniture furniture);

    Furniture getFurnitureById(UUID id);

    List<Furniture> getAllFurniture();

    void deleteFurniture(UUID id);
}
