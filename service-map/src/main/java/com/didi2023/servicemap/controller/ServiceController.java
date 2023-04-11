package com.didi2023.servicemap.controller;

import com.didi2023.internalcommon.dto.AmapDTO;
import com.didi2023.internalcommon.dto.ResponseResult;
import com.didi2023.servicemap.service.ServiceForMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private ServiceForMapService serviceForMapService;

    @PostMapping("/add")
    public ResponseResult add(@RequestBody AmapDTO amap){

        String name = amap.getName();
        return serviceForMapService.add(name);

    }
}
