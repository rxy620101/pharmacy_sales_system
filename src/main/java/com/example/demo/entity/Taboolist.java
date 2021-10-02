package com.example.demo.entity;

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
@TableName("taboolist")
@NoArgsConstructor
@AllArgsConstructor
public class Taboolist implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "medicineName",type = IdType.AUTO)
    private String medicineName;

    @TableField("medicineType")
    private String medicineType;

    @TableField("tabooDrugs")
    private String tabooDrugs;

    private String reaction;


}
