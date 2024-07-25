package com.example.exo5.service;


import com.example.exo5.models.Furniture;
import com.example.exo5.repository.FurnitureRepository;
import java.util.List;
import java.util.UUID;

public class FurnitureServiceImpl implements FurnitureService{

    private FurnitureRepository furnitureRepository;

    public FurnitureServiceImpl(FurnitureRepository furnitureRepository) {
        this.furnitureRepository = furnitureRepository;
    }

    public void addFurniture(Furniture furniture){
        furniture.setId(UUID.randomUUID());
        furnitureRepository.save(furniture);
    };

    public void saveFurniture(Furniture furniture){
        furnitureRepository.save(furniture);
    };

    public Furniture getFurnitureById(UUID id){
        return furnitureRepository.findById(id).orElse(null);
    };

    public List<Furniture> getAllFurniture(){
       return furnitureRepository.findAll();
    };

    public void deleteFurniture(UUID id){
        furnitureRepository.findById(id);
    };

}
