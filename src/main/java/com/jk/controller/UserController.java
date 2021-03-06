/**
 * Copyright (C), 2018-2018, jk有限公司
 * FileName: UserController
 * Author:  常路通
 * Date:     2018/5/8 20:28
 * Description: 用户控制类
 * /**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserController
 * Author:   chang
 * Date:     2018/5/8 20:28
 * Description: 用户控制类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.User;
import com.jk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户控制类〉
 *
 * @author chang
 * @create 2018/5/8
 * @since 1.0.0
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("getuserlist")
    @ResponseBody
    public String getuserlist(){
        List<User> list= userService.getuserlist();
        return JSON.toJSONString(list);
    }
}