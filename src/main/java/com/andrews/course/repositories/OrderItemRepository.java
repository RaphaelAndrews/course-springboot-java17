package com.andrews.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrews.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}