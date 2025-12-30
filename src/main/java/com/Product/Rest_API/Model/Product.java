package com.Product.Rest_API.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class Product {
    @Id
    private int  productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;
}
