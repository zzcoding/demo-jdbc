package com.example.demo.action;

import com.example.demo.service.IDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

/**
 * com.example.demo.action
 *
 * @author zhaoguang
 * @date 2018/1/11 15:32
 * @description
 */
@Controller
public class DemoAction {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    IDemoService demoService;

    @RequestMapping("/resource.view")
    public Object testRestfuEntity(Model model, HttpServletRequest request) {
        model.addAttribute("path", request.getContextPath());
        model.addAttribute("name", "测试的");
        model.addAttribute("list", demoService.getResources("高刚"));
        logger.info("测试打印日志:{},{}", "abc", 123);
        return "test";
    }
}
