package com.codegym.service;

import java.util.List;

public interface CategoryService<T> {
    List<T> findAllCategories();
    T findCategoryById(Long id);
    void saveCategory(T t);
    void removeCategory(Long id);
}
