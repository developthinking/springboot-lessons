package com.wuti.chapter12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/10/30.
 */
@RestController
public class TestController {
    //logback
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    /**
     * 访问首页
     * @return
     */
    @RequestMapping(value = "/test")
    public String index() {
        logger.debug("Test 记录debug日志");
        logger.info("Test 访问了index方法");
        logger.error("Test 记录error错误日志");
        return "test测试";
    }
}
