package com.cart.entity;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "cart_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "grain_type")
    private String grainType;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "price_per_kg")
    private double pricePerKg;

    private double amount;
    // Other fields, constructors, and methods
}

