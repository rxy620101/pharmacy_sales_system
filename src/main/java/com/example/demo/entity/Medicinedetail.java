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
@TableName("medicinedetail")
@NoArgsConstructor
@AllArgsConstructor
public class Medicinedetail implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "batchNumber")
    private String batchNumber;

    @TableField("productionTime")
    private Date productionTime;

    @TableField("expirationDate")
    private Date expirationDate;

    private BigDecimal price;

    private Integer number;


}
