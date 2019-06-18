package com.aming.controller;

import com.aming.domain.Orders;
import com.aming.service.IOrdersService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

    //查询全部订单---未分页
//    @RequestMapping("/findAll.do")
//    public ModelAndView findAll() throws Exception {
//        ModelAndView mv = new ModelAndView();
//        List<Orders> ordersList = ordersService.findAll();
//        mv.addObject("ordersList", ordersList);
//        mv.setViewName("orders-list");
//        return mv;
//    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") int page, @RequestParam(name = "pageSize", required = true, defaultValue = "4") int pageSize) throws Exception {
        ModelAndView mv=new ModelAndView();
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        List<Orders> ordersList = ordersService.findAll(page,pageSize);
        PageInfo pageInfo = new PageInfo(ordersList);
        List<Orders> list = pageInfo.getList();
        for(Orders orders:ordersList){
            System.out.println(orders);
        }
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("orders-page-list");
        return mv;
    }

    /*@RequestMapping("/findById.do")
    public ModelAndView findById(String id) throws Exception {
        Orders orders = ordersService.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("order-show");
        mv.addObject("orders", orders);
        return mv;
    }*/
}