package com.aaa.house.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface HouseDao {
    /**
     * 查询用户列表
     * @return
     */
    @Select("select * from house")
    List<Map> getList();

    /**
     * 根据id获取对象
     * @param Id
     * @return
     */
    @Select("select * from house where id=#{Id}")
    List<Map> getById(Integer Id);
}
