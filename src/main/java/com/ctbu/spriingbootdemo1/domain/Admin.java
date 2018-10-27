package com.ctbu.spriingbootdemo1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 跟admin表对应的类，管理员
 */
@Entity(name="admin")
public class Admin {

    @Id
    @GeneratedValue
    /**
     * 主键，自增
     */
    private  Integer id;

    /**
     * 管理员的名字
     */
    private  String name;

    /**
     * 管理员的密码
     */
    private  String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
