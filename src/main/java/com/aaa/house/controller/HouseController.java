package com.aaa.house.controller;

import com.aaa.house.service.EmpService;
import com.aaa.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HouseController {

    @Autowired
    private HouseService service;

    @Autowired
    private EmpService empService;

    @RequestMapping("/houseList")
    public Object list(){
        System.out.println(1111);
        return service.getList();
    }


    @RequestMapping("/houseById")
    public Object getHouse(Integer Id){
        Map house = service.getById(Id);
        house.put("empList",empService.getEmpList());
        return house;
    }
}
