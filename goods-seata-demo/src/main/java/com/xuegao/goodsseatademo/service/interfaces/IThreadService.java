package com.xuegao.goodsseatademo.service.interfaces;

/**
 * <br/> @PackageName：com.xuegao.springboot_tool.service.interfaces
 * <br/> @ClassName：IThreadService
 * <br/> @Description：
 * <br/> @author：xuegao
 * <br/> @date：2020/9/17 11:26
 */
public interface IThreadService {

    void createGoods();

    Long createGoods2(Long goodsId, Integer stock);
}