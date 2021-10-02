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
@TableName("discountinfo")
@NoArgsConstructor
@AllArgsConstructor
public class Discountinfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "idsalePlanId", type = IdType.AUTO)
    private int salePlanId;

    @TableField("endTime")
    private Date endTime;

    @TableField("startTime")
    private Date startTime;

    private BigDecimal discount;

    @TableField("medicineId")
    private String medicineId;

    private String remark;


}
