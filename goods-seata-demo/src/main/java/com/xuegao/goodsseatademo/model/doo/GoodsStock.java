package com.xuegao.goodsseatademo.model.doo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * <br/> @PackageName：com.xuegao.springboot_tool.model.doo
 * <br/> @ClassName：GoodsStock
 * <br/> @Description：
 * <br/> @author：xuegao
 * <br/> @date：2020/10/05 17:47
 */
@ApiModel(value = "商品库存表")
@TableName("t_goods_stock")
public class GoodsStock implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId("id")
    @ApiModelProperty(value = "主键")
    private Long id;

    @TableField("goods_id")
    @ApiModelProperty(value = "商品id")
    private Long goodsId;

    @TableField("stock")
    @ApiModelProperty(value = "商品库存")
    private Integer stock;

    @TableField("delete_flag")
    @ApiModelProperty(value = "0未删除，1已删除")
    private Integer deleteFlag;

    @TableField("create_id")
    @ApiModelProperty(value = "创建人id")
    private Long createId;

    @TableField("create_name")
    @ApiModelProperty(value = "创建人真实名称")
    private String createName;

    @TableField("create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @TableField("update_id")
    @ApiModelProperty(value = "修改人id")
    private Long updateId;

    @TableField("update_name")
    @ApiModelProperty(value = "修改人真实名称")
    private String updateName;

    @TableField("update_time")
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public Long getCreateId() {
        return createId;
    }

    public String getCreateName() {
        return createName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public String getUpdateName() {
        return updateName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "GoodsStock{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", stock=" + stock +
                ", deleteFlag=" + deleteFlag +
                ", createId=" + createId +
                ", createName=" + createName +
                ", createTime=" + createTime +
                ", updateId=" + updateId +
                ", updateName=" + updateName +
                ", updateTime=" + updateTime +
                "}";
    }
}
