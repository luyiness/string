package com.example;

/**
 * @Date:2021/02_10:28 上午
 * @Description：
 */
public class Book {

    private String name;
    private Integer id;

    public Book(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Book() {

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
