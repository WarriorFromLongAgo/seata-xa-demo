package com.xuegao.goodsseatademo.service.impl;

import com.xuegao.goodsseatademo.dao.IGoodsStockMapper;
import com.xuegao.goodsseatademo.model.doo.GoodsStock;
import com.xuegao.goodsseatademo.service.interfaces.IThreadService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * <br/> @PackageName：com.xuegao.springboot_tool.service.impl
 * <br/> @ClassName：ThreadServiceImpl
 * <br/> @Description：
 * <br/> @author：xuegao
 * <br/> @date：2020/9/17 11:26
 */
@Service
public class ThreadServiceImpl extends BaseServiceImpl<IGoodsStockMapper, GoodsStock> implements IThreadService {
    private Logger log = LoggerFactory.getLogger(ThreadServiceImpl.class);

    private IGoodsStockMapper goodsStockMapper;

    @Autowired
    public ThreadServiceImpl(IGoodsStockMapper goodsStockMapper) {
        this.goodsStockMapper = goodsStockMapper;
    }

    @Override
    public void createGoods() {
        GoodsStock goodsStock = new GoodsStock();
        boolean save = save(goodsStock);
        System.out.println("createGoods = " + goodsStock.getId());
    }

    @Transactional
    @GlobalTransactional
    @Override
    public Long createGoods2(Long goodsId, Integer stock) {
        String xid = RootContext.getXID();
        System.out.println("xid = " + xid);

        GoodsStock goodsStock = new GoodsStock();
        goodsStock.setGoodsId(goodsId);
        goodsStock.setStock(stock);
        goodsStockMapper.saveGoods(goodsStock);
        // boolean save = save(goodsStock);
        System.out.println("createGoods2 = " + goodsStock.getId());
        return goodsStock.getId();
    }
}