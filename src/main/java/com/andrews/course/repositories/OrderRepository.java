package com.andrews.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrews.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}