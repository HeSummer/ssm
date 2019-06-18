package com.aming.dao;

import com.aming.domain.Orders;


import java.util.List;


public interface IOrdersDao {
    /**
     *查找订单列表
     */
    public List<Orders> findAll() throws Exception;

}
