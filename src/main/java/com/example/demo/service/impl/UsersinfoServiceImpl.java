package com.example.demo.service.impl;

import com.example.demo.entity.Usersinfo;
import com.example.demo.mapper.UsersinfoMapper;
import com.example.demo.service.UsersinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author xinguan
 * @since 2021-09-29
 */
@Service
public class UsersinfoServiceImpl extends ServiceImpl<UsersinfoMapper, Usersinfo> implements UsersinfoService {
    @Autowired
    UsersinfoMapper usersinfoMapper;
    @Override
    public Usersinfo getUSer(String account) {
        return usersinfoMapper.getByAccount(account);
    }
}
