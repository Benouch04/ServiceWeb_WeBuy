package com.example.J2EE_WeBuy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.J2EE_WeBuy.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

}