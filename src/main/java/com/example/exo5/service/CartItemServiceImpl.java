package com.example.exo5.service;

import com.example.exo5.models.CartItem;
import com.example.exo5.models.Furniture;
import com.example.exo5.repository.CartItemRepository;
import java.util.List;
import java.util.UUID;

public class CartItemServiceImpl implements CartItemService {

    private final CartItemRepository cartItemRepository;
    private final FurnitureServiceImpl furnitureServiceImpl;

    public CartItemServiceImpl(CartItemRepository cartItemRepository, FurnitureServiceImpl furnitureServiceImpl) {
        this.cartItemRepository = cartItemRepository;
        this.furnitureServiceImpl = furnitureServiceImpl;
    }

    public void addCartItem(CartItem cartItem){
        cartItemRepository.save(cartItem);
    };

    public CartItem getById(UUID id){
        return cartItemRepository.findById(id).orElse(null);
    };

    public List<CartItem> getAllCartItems(){
        return cartItemRepository.findAll();
    };

    public void deleteCartItem(UUID id){
         CartItem cartItem = cartItemRepository.findById(id).orElse(null);
         if(cartItem != null){
             Furniture furnitureExist = furnitureServiceImpl.getFurnitureById(id);
             if(furnitureExist != null){
                 cartItemRepository.delete(cartItem);
             }
         }
    };

}
