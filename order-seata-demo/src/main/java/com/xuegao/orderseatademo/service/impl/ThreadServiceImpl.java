package com.xuegao.orderseatademo.service.impl;

import com.xuegao.orderseatademo.dao.IOrderInfoMapper;
import com.xuegao.orderseatademo.model.doo.OrderInfo;
import com.xuegao.orderseatademo.service.interfaces.IThreadService;
import org.springframework.stereotype.Service;


/**
 * <br/> @PackageName：com.xuegao.springboot_tool.service.impl
 * <br/> @ClassName：ThreadServiceImpl
 * <br/> @Description：
 * <br/> @author：xuegao
 * <br/> @date：2020/9/17 11:26
 */
@Service
public class ThreadServiceImpl extends BaseServiceImpl<IOrderInfoMapper, OrderInfo> implements IThreadService {

    @Override
    public void createOrder() {
        OrderInfo orderInfo = new OrderInfo();
        boolean save = save(orderInfo);
        System.out.println("createOrder = " + orderInfo.getId());
    }

    @Override
    public Long createOrder2(Long orderId, String orderName) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(orderId);
        orderInfo.setOrderName(orderName);
        boolean save = save(orderInfo);
        System.out.println("createOrder2 = " + orderInfo.getId());
        return orderInfo.getId();
    }
}