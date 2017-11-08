package cn.wuti.chapter25.user.controller;

import cn.wuti.chapter25.user.bean.UserBean;
import cn.wuti.chapter25.user.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/11/8.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserJPA userJPA;

    /**
     * 查询所有用户列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<UserBean> list(){
        return userJPA.findAll();
    }
}
