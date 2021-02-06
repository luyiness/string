package com.example;

/**
 * @Date:2021/02_11:29 上午
 * @Description：
 */
public class Orders {

    public Orders() {
        System.out.println("构造器");
    }

    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("set方法");
    }

    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }
}
