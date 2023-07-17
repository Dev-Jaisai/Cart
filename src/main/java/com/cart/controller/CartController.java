package com.cart.controller;
import com.ChakkiBaaz.grainorder.payload.GrainOrderDTO;
import com.cart.cartService.CartService;
import com.cart.entity.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/addToCart")
    public ResponseEntity<String> addGrainOrderToCart(@RequestBody GrainOrderDTO grainOrderDTO) {
        cartService.addGrainOrderToCart(grainOrderDTO);
        return ResponseEntity.status(HttpStatus.OK).body("Grain order added to cart successfully");
    }
    @GetMapping("/allItems")
    public ResponseEntity <List<CartItem>> getListOfCartItems() {
        List<CartItem> listOfCartItems = cartService.getListOfCartItems();
        return new ResponseEntity<>(listOfCartItems,HttpStatus.OK);
    }
}
