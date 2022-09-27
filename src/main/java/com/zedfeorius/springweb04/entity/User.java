package com.zedfeorius.springweb04.entity;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 27 2022  14:01:32
 * @packageName com.zedfeorius.springweb04.entity
 * @className User
 * @describe TODO
 */
public class User {
    private Integer id;
    private String name;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

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
