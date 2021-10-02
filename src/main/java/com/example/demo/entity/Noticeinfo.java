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
@TableName("noticeinfo")
@NoArgsConstructor
@AllArgsConstructor
public class Noticeinfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "noticeId",type = IdType.AUTO)
    private int noticeId;

    @TableField("noticeContent")
    private String noticeContent;

    private Date time;


}
