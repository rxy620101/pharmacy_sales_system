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
@TableName("usersinfo")
@NoArgsConstructor
@AllArgsConstructor
public class Usersinfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "customerId",type = IdType.AUTO)
    private int customerId;

    @TableField("customerName")
    private String customerName;

    private String account;

    private String password;

    private Integer points;

    private String allergen;




}
