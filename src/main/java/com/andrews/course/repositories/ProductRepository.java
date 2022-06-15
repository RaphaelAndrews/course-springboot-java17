package com.andrews.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrews.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}