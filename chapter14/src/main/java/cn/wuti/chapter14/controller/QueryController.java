package cn.wuti.chapter14.controller;

import cn.wuti.chapter14.Inquirer;
import cn.wuti.chapter14.entity.GoodEntity;
import cn.wuti.chapter14.entity.QGoodEntity;
import cn.wuti.chapter14.jpa.GoodJPA;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * GoodController
 * Created by Administrator on 2017/10/31.
 */
@RestController
@RequestMapping(value = "/good")
public class QueryController {

    @Autowired
    private GoodJPA goodJPA;

    //注入EntityManager
    @PersistenceContext
    private EntityManager entityManager;

    @RequestMapping(value = "/query")
    public List<GoodEntity> list() {
        //querydsl查询实体
        QGoodEntity _good = QGoodEntity.goodEntity;
        //构建JPA查询对象
        JPAQuery<GoodEntity> jpaQuery = new JPAQuery<>(entityManager);
        //返回查询接口
        return jpaQuery
                //查询字段
                .select(_good)
                //查询表
                .from(_good)
                //查询条件
                .where(_good.type.id.eq(Long.valueOf("1")))
                //返回结果
                .fetch();
    }

    /**
     * spring data jpa 整合querydsl完成查询
     * 封装前
     * @return
     */
    @RequestMapping(value = "/join")
    public List<GoodEntity> join() {
        //querydsl查询实体
        QGoodEntity _good = QGoodEntity.goodEntity;

        //查询条件
        BooleanExpression expression = _good.type.id.eq(Long.valueOf("1"));
        //执行查询
        Iterator<GoodEntity> iterator = goodJPA.findAll(expression).iterator();
        List<GoodEntity> goods = new ArrayList<>();
        //转成list
        while (iterator.hasNext()) {
            goods.add(iterator.next());
        }
        return goods;
    }

    /**
     * spring data jpa 整合querydsl完成查询
     * 封装后
     * @return
     */
    @RequestMapping(value = "/basejoin")
    public List<GoodEntity> basejoin() {
        //querydsl查询实体
        QGoodEntity _good = QGoodEntity.goodEntity;
        //自定义查询对象
        Inquirer inquirer = new Inquirer();
        //添加查询条件
        inquirer.putExpression(_good.type.id.eq(Long.valueOf("1")));
        //返回查询结果
        return inquirer.iteratorToList(goodJPA.findAll(inquirer.buidleQuery()));
    }
}
