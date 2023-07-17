package com.cart.cartService;

import com.ChakkiBaaz.grainorder.payload.GrainOrderDTO;
import com.cart.entity.CartItem;

import java.util.List;

public interface CartService {
    public abstract void addGrainOrderToCart(GrainOrderDTO grainOrderDTO);

    public List<CartItem> getListOfCartItems() ;

}
