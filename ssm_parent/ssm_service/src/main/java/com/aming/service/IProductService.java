package com.aming.service;

import com.aming.domain.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll() throws Exception;
}
