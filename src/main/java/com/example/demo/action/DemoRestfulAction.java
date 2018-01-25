package com.example.demo.action;

import com.example.demo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.example.demo.action
 *
 * @author zhaoguang
 * @date 2018/1/11 15:33
 * @description
 */
@RestController
public class DemoRestfulAction {

    @Autowired
    IDemoService demoService;

    @RequestMapping("/resources")
    public Object testRestfuEntity() {

        return demoService.getResourcesEntity();

    }

}
