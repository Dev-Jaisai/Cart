package com.cart.cartService.cartServiceImpl;

import com.ChakkiBaaz.grainorder.payload.GrainOrderDTO;
import com.cart.cartService.CartService;
import com.cart.entity.Cart;
import com.cart.entity.CartItem;
import com.cart.payload.cartItemsDTO;
import com.cart.repository.CartItemRepository;
import com.cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final ModelMapper modelMapper;
    private final CartItemRepository cartItemRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository, ModelMapper modelMapper,CartItemRepository cartItemRepository) {
        this.cartRepository = cartRepository;
        this.modelMapper = modelMapper;
        this.cartItemRepository=cartItemRepository;
    }

    @Override
    @Transactional
    public void addGrainOrderToCart(GrainOrderDTO grainOrderDTO) {
        // Convert GrainOrderDTO to CartItem entity
        CartItem cartItem = modelMapper.map(grainOrderDTO, CartItem.class);

        // Save the CartItem to the database
        cartItemRepository.save(cartItem);
    }

    @Override
    public List<CartItem> getListOfCartItems() {
        return cartItemRepository.findAll();


    }


}
