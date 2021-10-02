package com.example.demo.entity;

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
@TableName("loginfo")
@NoArgsConstructor
@AllArgsConstructor
public class Loginfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "Logid",type = IdType.AUTO)
    private String Logid;

    @TableField("OperationType")
    private Integer OperationType;

    @TableField("medicineId")
    private String medicineId;

    @TableField("batchNumber")
    private String batchNumber;

    @TableField("UDNum")
    private Integer UDNum;

    @TableField("UDTime")
    private Date UDTime;


}
