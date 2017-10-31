package cn.wuti.chapter14.jpa;

import cn.wuti.chapter14.entity.GoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by Administrator on 2017/10/31.
 */
public interface GoodJPA
        extends
        JpaRepository<GoodEntity, Long>,
        QueryDslPredicateExecutor<GoodEntity>
{

}
