package com.example.exo5.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table
public class Furniture {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;
    private double price;
    private int stock;
    @OneToMany(mappedBy = "productId", cascade = CascadeType.REMOVE)
    List<CartItem> cartItems;

    public Furniture(UUID id, int stock, double price, String description, String name) {
        this.id = id;
        this.stock = stock;
        this.price = price;
        this.description = description;
        this.name = name;
    }

    public Furniture() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
