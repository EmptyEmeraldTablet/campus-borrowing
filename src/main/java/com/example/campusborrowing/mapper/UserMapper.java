package com.example.campusborrowing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.campusborrowing.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
