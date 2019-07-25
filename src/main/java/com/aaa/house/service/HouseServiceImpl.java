package com.aaa.house.service;

import com.aaa.house.dao.HouseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseDao houseDao;

    @Override
    public List<Map> getList() {
        return houseDao.getList();
    }

    @Override
    public Map getById(Integer Id) {
        List<Map> HouseList = houseDao.getById(Id);
        if (HouseList!=null&&HouseList.size()>0){
            return HouseList.get(0);
        }
        return null;
    }


}
