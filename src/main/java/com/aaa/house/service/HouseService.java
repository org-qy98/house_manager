package com.aaa.house.service;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface HouseService {


    /**
     * 查询用户列表
     * @return
     */
    List<Map> getList();

    /**
     * 根据id获取对象
     * @param Id
     * @return
     */
    Map getById(Integer Id);
}
