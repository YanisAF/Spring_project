package com.example.exo5.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int quantity;


    @ManyToOne
    @JoinColumn(name = "furniture_id")
    private Furniture productId;

    public CartItem(UUID id, Furniture productId, int quantity) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
    }

    public CartItem() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Furniture getProductId() {
        return productId;
    }

    public void setProductId(Furniture productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
