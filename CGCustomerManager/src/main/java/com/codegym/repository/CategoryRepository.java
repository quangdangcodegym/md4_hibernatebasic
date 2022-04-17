package com.codegym.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository<T> {
    List<T> findAllCategories();
    T findCategoryById(Long id);
    void saveCategory(T t);
    void removeCategory(T t);
}
