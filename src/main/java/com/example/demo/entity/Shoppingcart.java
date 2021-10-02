package com.example.demo.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("shoppingcart")
@NoArgsConstructor
@AllArgsConstructor
public class Shoppingcart implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "shoppingId",type = IdType.AUTO)
    private Integer shoppingId;

    @TableField("customerId")
    private int customerId;

    @TableField("medicineId")
    private String medicineId;

    @TableField("medicineNumber")
    private Integer medicineNumber;

    @TableField("medicinePrice")
    private BigDecimal medicinePrice;


}
