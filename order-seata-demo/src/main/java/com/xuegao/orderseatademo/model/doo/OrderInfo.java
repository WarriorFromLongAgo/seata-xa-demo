package com.xuegao.orderseatademo.model.doo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * <br/> @PackageName：com.xuegao.springboot_tool.model.doo
 * <br/> @ClassName：OrderInfo
 * <br/> @Description：
 * <br/> @author：xuegao
 * <br/> @date：2020/10/05 17:48
 */
@ApiModel(value = "订单表")
@TableName("t_order_info")
public class OrderInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId("id")
    @ApiModelProperty(value = "主键")
    private Long id;

    @TableField("order_id")
    @ApiModelProperty(value = "商品id")
    private Long orderId;

    @TableField("order_name")
    @ApiModelProperty(value = "商品默认名称")
    private String orderName;

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

    public Long getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
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

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
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
        return "OrderInfo{" +
            "id=" + id +
            ", orderId=" + orderId +
            ", orderName=" + orderName +
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