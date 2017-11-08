package cn.wuti.chapter25.base.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/8.
 */
public interface BaseDao<T>
        extends
        JpaRepository<T, Long>,
        JpaSpecificationExecutor<T>,
        Serializable
{

}
