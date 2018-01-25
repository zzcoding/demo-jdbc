package com.example.demo.service.impl;

import com.example.demo.service.IDemoCallService;
import com.example.demo.service.IDemoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * com.example.demo.service.impl
 *
 * @author zhaoguang
 * @date 2018/1/24 17:28
 * @description
 */
@Service
public class DemoCallService implements IDemoCallService {


    @Resource
    IDemoService demoService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void call() {
        demoService.updateUser();
    }
}
