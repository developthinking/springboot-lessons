package cn.wuti.lessonSix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * IndexController
 * Created by Administrator on 2017/10/28.
 */
@Controller
@RequestMapping("/user")
public class IndexController {
    /**
     * 初始化登录页面
     * @return
     */
    @RequestMapping(value = "/login_view", method = RequestMethod.GET)
    public String login_view() {
        return "login";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
