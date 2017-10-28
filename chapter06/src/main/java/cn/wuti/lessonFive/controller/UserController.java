package cn.wuti.lessonFive.controller;

import cn.wuti.base.entity.UserEntity;
import cn.wuti.base.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 * Created by Administrator on 2017/10/28.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    /**
     * 查询用户列表方法
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserEntity> list() {
        return userJPA.findAll();
    }
}
