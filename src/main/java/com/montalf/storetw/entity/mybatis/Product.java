package com.montalf.storetw.entity.mybatis;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private Long id;
    private String name;
    private Double price;
}
