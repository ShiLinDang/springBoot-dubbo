package com.java4all.dao;

import com.java4all.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User findByMobile(String mobile);
}
