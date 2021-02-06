package com.example.jdbc.dao;

import com.example.jdbc.entity.Admin;

import java.util.List;

/**
 * @Date:2021/02_1:28 下午
 * @Description：
 */
public interface AdminDao {
    void add(Admin admin);

    void delete(Integer id);

    void update(Admin admin, Integer id);

    Admin findOne(Integer id);

    List<Admin> findAll();
}
