package cn.wuti.chapter25.book.controller;

import cn.wuti.chapter25.book.bean.BookBean;
import cn.wuti.chapter25.book.jpa.BookJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/11/8.
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    private BookJPA bookJPA;

    /**
     * 查询书籍列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<BookBean> list() {
        return bookJPA.findAll();
    }
}
