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
@TableName("tradeinfo")
@NoArgsConstructor
@AllArgsConstructor
public class Tradeinfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "tradeId",type = IdType.AUTO)
    private Integer tradeId;

    @TableField("paymentNum")
    private String paymentNum;

    @TableField("ordersId")
    private int ordersId;

    private BigDecimal money;

    @TableField("payWay")
    private String payWay;

    @TableField("dealType")
    private String dealType;

    @TableField("dealTime")
    private Date dealTime;


}
