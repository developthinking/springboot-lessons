package com.wuti.lessonTwo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/10/10.
 */
@Controller
public class IndexController {
    /**
     * 访问webapp/jsp/index.jsp文件
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
