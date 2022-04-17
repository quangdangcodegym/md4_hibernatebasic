package com.codegym.repository.impl;

import com.codegym.model.Category;
import com.codegym.model.Customer;
import com.codegym.repository.CategoryRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CategoryRepositoryImpl implements CategoryRepository<Category> {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Category> findAllCategories() {
        TypedQuery<Category> query = em.createQuery("select c from Category c", Category.class);
        return query.getResultList();
    }

    @Override
    public Category findCategoryById(Long id) {
        return null;
    }

    @Override
    public void saveCategory(Category category) {
        if (category.getId() != -1) {
            em.merge(category);
        } else {
            em.persist(category);
        }
    }

    @Override
    public void removeCategory(Category category) {

    }
}
