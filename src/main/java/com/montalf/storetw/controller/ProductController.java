package com.montalf.storetw.controller;

import com.montalf.storetw.entity.mybatis.Product;
import com.montalf.storetw.mapper.ProductMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductMapper mapper;

    public ProductController(ProductMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping
    public List<Product> findAll() {
        return mapper.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return mapper.findById(id);
    }

    @PostMapping
    public void insert(@RequestBody Product product) {
        mapper.insert(product);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        mapper.update(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        mapper.delete(id);
    }
}
