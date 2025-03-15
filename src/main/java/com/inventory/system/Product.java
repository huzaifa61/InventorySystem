package com.inventory.system;


import lombok.Data;

@Data
public class Product {
    private Long productId;
    private String locationId;
    private Integer quantity;
}
