package com.codegym.repository;

import java.util.List;

public interface CustomerRepository<T> {
    List<T> findAllCustomer();
    T findCustomerById(Long id);
    void saveCustomer(T t);
    void removeCustomer(T t);
}
