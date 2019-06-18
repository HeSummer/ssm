package com.aming.service;

import com.aming.domain.Orders;

import java.util.List;

public interface IOrdersService {
    /**
     *查找订单列表
     */
    public List<Orders> findAll(int page, int size) throws Exception;

}
