package cn.wuti.chapter17.jpa;

import cn.wuti.chapter17.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserJPA
 * Created by Administrator on 2017/11/2.
 */
public interface UserJPA extends JpaRepository<UserEntity, Long> {

    //使用SpringDataJPA方法定义查询
    public UserEntity findByUsername(String username);
}
