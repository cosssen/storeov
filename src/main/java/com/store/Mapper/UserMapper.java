package com.store.Mapper;

import com.store.domain.po.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /**
     * 根据 id 查询用户（SQL 在 resources/com/store/mapper/UserMapper.xml）
     */
    User getById(Long id);
}