package org.example;

import org.apache.ibatis.annotations.Select;

public interface HeiheiMapper {
    @Select("select * from heihei")
    Heihei selectAll();
}
