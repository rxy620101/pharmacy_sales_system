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
@TableName("medicineinfo")
@NoArgsConstructor
@AllArgsConstructor
public class Medicineinfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "medicineId")
    private String medicineId;

    @TableField("treatType")
    private String treatType;

    @TableField("medicineName")
    private String medicineName;

    @TableField("batchNumber")
    private String batchNumber;

    private String bases;

    private String storage;

    private String manufacturers;

    private String efficacy;

    private String attentions;

    @TableField("medicineType")
    private String medicineType;

    private String usage;

    @TableField("useLevel")
    private String useLevel;

    @TableField("badReaction")
    private String badReaction;

    @TableField("dosageForm")
    private String dosageForm;

    private BigDecimal specification;

    private BigDecimal packing;

    @TableField("isRX")
    private Integer isRX;

    private String area;

    private String smell;

    private String unit;

    private Integer total;


}
