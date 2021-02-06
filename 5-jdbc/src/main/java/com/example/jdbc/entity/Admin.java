package com.example.jdbc.entity;

/**
 * @Date:2021/02_1:39 下午
 * @Description：
 */
public class Admin {
    private Integer id;
    private String name;
    private String pass;

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Admin(Integer id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }
    public Admin() {
    }
}
