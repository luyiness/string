package com.example.jdbc.service;

import com.example.jdbc.dao.AdminDao;
import com.example.jdbc.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date:2021/02_1:29 下午
 * @Description：
 */
@Service
public class AdminService {

    @Autowired
    private AdminDao adminDao;

    public void add(Admin admin){
        adminDao.add(admin);
    }

    public void delete(Integer id){
        adminDao.delete(id);
    }

    public void update(Admin admin,Integer id){
        adminDao.update(admin,id);
    }

    public Admin findOne(Integer id){
        return adminDao.findOne(id);
    }

    public List<Admin> findAll(){
        return adminDao.findAll();
    }
}
