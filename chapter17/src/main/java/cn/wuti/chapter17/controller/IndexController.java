package cn.wuti.chapter17.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/2.
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index success";
    }
}
