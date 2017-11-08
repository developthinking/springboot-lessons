package cn.wuti.chapter23.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/8.
 */
public class UserBean implements Serializable {
    //用户名
    private String name;
    //密码
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
