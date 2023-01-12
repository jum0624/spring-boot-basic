package com.springboot.advanced_jpa.repository;

import com.springboot.advanced_jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
