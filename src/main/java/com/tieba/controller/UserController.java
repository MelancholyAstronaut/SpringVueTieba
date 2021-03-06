package com.tieba.controller;


import com.alibaba.fastjson.JSON;
import com.tieba.bean.User;
import com.tieba.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.UUID;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-10-20 14:34:22
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

    @PostMapping("/login")
    public Object login(User user) {
        
        StringBuilder token = new StringBuilder();
        UUID uuid = UUID.randomUUID();
        token.append(uuid);
        User user1 = this.userService.queryAll(user);
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", user1.getName());
        map.put("token", token + user1.getName());
        map.put("currTime", System.currentTimeMillis());
        return JSON.toJSON(map);
    }
}