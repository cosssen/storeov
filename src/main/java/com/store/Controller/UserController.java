package com.store.Controller;

import cn.hutool.core.bean.BeanUtil;
import com.store.Service.UserService;
import com.store.domain.dto.UserDTO;
import com.store.domain.po.Result;
import com.store.domain.po.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     */
    @PostMapping("/login")
    public Result loginInfo(@RequestBody User user) {
        return Result.success();
    }
    /**
     * 根据 id 查询用户
     * 访问示例：GET /user/1
     */
    @GetMapping("/{id}")
    public UserDTO getUserInfo(@PathVariable("id") Long id) {
        log.info("查询的id是{}",id);
        User user = userService.getUserById(id);
        return BeanUtil.copyProperties(user, UserDTO.class);
    }
}