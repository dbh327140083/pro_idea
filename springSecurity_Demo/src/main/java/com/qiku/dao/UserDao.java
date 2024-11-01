package com.qiku.dao;

import com.qiku.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from users where username =#{username}")
    Users findUser(String username);
}
