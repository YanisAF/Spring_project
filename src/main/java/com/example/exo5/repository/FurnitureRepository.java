package com.example.exo5.repository;

import com.example.exo5.models.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface FurnitureRepository extends JpaRepository<Furniture, UUID> {
}
