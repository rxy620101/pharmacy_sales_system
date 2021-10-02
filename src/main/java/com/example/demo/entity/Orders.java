package com.example.demo.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author xinguan
 * @since 2021-09-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("orders")
@NoArgsConstructor
@AllArgsConstructor
public class Orders implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ordersId")
    private String ordersId;

    @TableField("orderStatus")
    private String orderStatus;

    @TableField("orderPrice")
    private BigDecimal orderPrice;

    @TableField("payPrice")
    private BigDecimal payPrice;

    @TableField("creationTime")
    private Date creationTime;

    @TableField("paymentTime")
    private Date paymentTime;

    private Integer code;

    @TableField("addressId")
    private int addressId;

    @TableField("paymentNum")
    private String paymentNum;

    @TableField("deliveryWay")
    private String deliveryWay;

    @TableField("deliveryTime")
    private Date deliveryTime;


}
