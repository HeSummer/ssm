package com.aming.dao;

import com.aming.domain.Product;

import java.util.List;

public interface IProductDao {
     List<Product> findAll()throws Exception;;
}
