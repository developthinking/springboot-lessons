package cn.wuti.controller;

import cn.wuti.bean.UserBean;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/4.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request, UserBean user) {
        //将name属性传入到user_index.jsp页面中展示
        request.setAttribute("name", user.getName());
        return "user_index";
    }
}
