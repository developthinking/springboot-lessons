package com.wuti;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 静态资源配置类
 * Created by Administrator on 2017/10/30.
 */
@Configuration
public class StaticConfiguration extends WebMvcConfigurerAdapter {
    //自定义静态资源文件路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/wuti/resources/**").addResourceLocations("classpath:/static/");
    }
}
