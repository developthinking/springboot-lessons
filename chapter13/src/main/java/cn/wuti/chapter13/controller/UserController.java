package cn.wuti.chapter13.controller;

import cn.wuti.chapter13.entity.UserEntity;
import cn.wuti.chapter13.jpa.UserJPA;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 * Created by Administrator on 2017/10/31.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    @RequestMapping(value = "/list")
    public List<UserEntity> list() {
        return userJPA.findAll();
    }

    @RequestMapping(value = "/add")
    public String add() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("测试");
        userEntity.setAddress("测试地址");
        userEntity.setAge(21);
        userJPA.save(userEntity);
        return "用户信息添加成功";
    }

    @RequestMapping(value = "/delete")
    public String delete(Long userId)
    {
        userJPA.delete(userId);
        return "用户信息删除成功";
    }

    @RequestMapping(value = "/age")
    public List<UserEntity> age(int age) {
        return userJPA.nativeQuery(age);
    }

    /**
     * 根据条件自定义编写删除SQL
     * @return
     */
    @RequestMapping(value = "/deleteWhere")
    public String deleteWhere()
    {
        userJPA.deleteQuery("测试", "123456");
        return "自定义SQL删除数据成功";
    }

    /**
     * 分页查询测试
     * @param page 传入页码，从1开始
     * @return
     */
    @RequestMapping(value = "/cutPage")
    public JSONObject cutPage(int page) {
        UserEntity user = new UserEntity();
        user.setSize(3);
        user.setSidx("age");
        user.setSord("desc");
        user.setPage(page);

        //获取排序对象
        Sort.Direction sort_direction = Sort.Direction.ASC.toString().equalsIgnoreCase(user.getSord()) ? Sort.Direction.ASC : Sort.Direction.DESC;
        //设置排序对象参数
        Sort sort = new Sort(sort_direction, user.getSidx());
        //创建分页对象
        PageRequest pageRequest = new PageRequest(user.getPage()-1, user.getSize(), sort);
        //执行分页查询
        Page<UserEntity> userPage = userJPA.findAll(pageRequest);

        JSONObject result = new JSONObject();
        result.put("list", userPage.getContent());
        result.put("totalElements", userPage.getTotalElements());
        result.put("totalPages", userPage.getTotalPages());
        return result;
    }
}
