package com.example.demo.service;

import com.example.demo.entity.Usersinfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xinguan
 * @since 2021-09-29
 */
public interface UsersinfoService extends IService<Usersinfo> {
    public Usersinfo getUSer(String account);

}
