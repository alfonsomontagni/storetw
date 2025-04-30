package com.montalf.storetw.mapper;


import com.montalf.storetw.entity.mybatis.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("SELECT * FROM products")
    List<Product> findAll();

    Product findById(Long id);

    void insert(Product product);

    void update(Product product);

    void delete(Long id);
}
