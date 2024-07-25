package com.example.exo5.service;

import com.example.exo5.models.CartItem;
import java.util.List;
import java.util.UUID;

public interface CartItemService {

    void addCartItem(CartItem cartItem);

    CartItem getById(UUID id);

    List<CartItem> getAllCartItems();

    void deleteCartItem(UUID id);

}
