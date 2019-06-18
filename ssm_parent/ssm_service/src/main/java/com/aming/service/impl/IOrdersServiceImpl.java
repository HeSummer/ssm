package com.aming.service.impl;

import com.aming.dao.IOrdersDao;
import com.aming.domain.Orders;
import com.aming.service.IOrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class IOrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao iOrdersDao;
    /**
     *分页订单查询
     *
     * @param page 当前页
     * @param pageSize 每页显示条数
     *
     */

    public List<Orders> findAll(int page, int pageSize) throws Exception {
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page,pageSize);
        return iOrdersDao.findAll();
    }


}
