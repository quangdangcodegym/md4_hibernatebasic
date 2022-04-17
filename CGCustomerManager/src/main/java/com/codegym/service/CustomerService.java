package com.codegym.service;

import java.util.List;

public interface CustomerService<T> {
    List<T> findAllCustomer();
    T findCustomerById(Long id);
    void saveCustomer(T t);
    void removeCustomer(Long id);
    T findCusomerById(Long id);
}
