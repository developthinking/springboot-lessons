package com.wuti.lesson07.jpa;

import com.wuti.lesson07.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 请求日志数据接口
 * Created by Administrator on 2017/10/28.
 */
public interface LoggerJPA extends JpaRepository<LoggerEntity, Long> {
}
