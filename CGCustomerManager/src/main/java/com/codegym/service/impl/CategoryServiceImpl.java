package com.codegym.service.impl;

import com.codegym.model.Category;
import com.codegym.repository.CategoryRepository;
import com.codegym.repository.CustomerRepository;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService<Category> {
    @Autowired
    public CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAllCategories();
    }

    @Override
    public Category findCategoryById(Long id) {
        return null;
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.saveCategory(category);
    }

    @Override
    public void removeCategory(Long id) {

    }
}
