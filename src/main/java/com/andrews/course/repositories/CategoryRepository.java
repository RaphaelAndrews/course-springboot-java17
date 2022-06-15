package com.andrews.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrews.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}