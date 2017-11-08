package cn.wuti.chapter26.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/8.
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/cors")
    public String corsIndex(){
        return "this is cors info.";
    }
}
