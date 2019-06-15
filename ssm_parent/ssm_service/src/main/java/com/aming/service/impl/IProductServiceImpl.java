package com.aming.service.impl;

import com.aming.dao.IProductDao;
import com.aming.domain.Product;
import com.aming.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class IProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao iProductDao;
    @Override
    public List<Product> findAll() throws Exception {
        return iProductDao.findAll();
    }
}
