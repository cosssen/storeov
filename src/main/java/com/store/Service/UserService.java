package com.store.Service;

import com.store.domain.po.User;

public interface UserService {

    /**
     * 根据 id 查询用户
     */
    User getUserById(Long id);
}