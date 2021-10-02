package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.entity.Usersinfo;
import com.example.demo.service.UsersinfoService;
import com.example.demo.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@RequestMapping("/user")
public class LoginController {
    Logger logger=Logger.getLogger("loginController");
    @Autowired
    UsersinfoService usersinfoService;
    //返回json数据给前端
    @ResponseBody
    @RequestMapping("/unlogin")
    public Object unLoin(){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code","10000");
        map.put("message","未登录");
        logger.info("未登录");
        return map;

    }


    @RequestMapping(value = "/dologin")
    public Result dologin(@RequestParam("account") String account, @RequestParam("password") String password) {
        String userPassword = MD5Utils.encrypt(password.trim());
        Usersinfo usersinfo=usersinfoService.getUSer(account);
        if(usersinfo!=null){
            if(usersinfo.getPassword().equals(userPassword)){
                return Result.ok("登录成功");
            }
            else{
                return Result.ok("密码错误！！");
            }

        }
        else{
            return Result.ok("该用户不存在！！");
        }


    }
}


