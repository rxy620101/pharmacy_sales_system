package com.example.demo.mapper;

import com.example.demo.entity.Usersinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xinguan
 * @since 2021-09-29
 */
public interface UsersinfoMapper extends BaseMapper<Usersinfo> {
    public Usersinfo getByAccount(String account);

}
