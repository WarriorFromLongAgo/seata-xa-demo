package com.xuegao.goodsseatademo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xuegao.goodsseatademo.model.doo.GoodsStock;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * <br/> @PackageName：com.xuegao.springboot_tool.dao
 * <br/> @ClassName：IThreadMapper
 * <br/> @Description：
 * <br/> @author：xuegao
 * <br/> @date：2020/9/17 11:28
 */
@Repository
public interface IGoodsStockMapper extends BaseMapper<GoodsStock> {

    // @Insert("insert into cloudalibaba_seata_goods.t_goods_stock(id, goods_id, stock) values (null, #{goods_id}, #{stock)")
    int saveGoods(GoodsStock goodsStock);

}