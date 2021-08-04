package org.example;

import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {
    User selectOne(Integer id);
}
