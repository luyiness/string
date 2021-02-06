package com.example.jdbc.dao;

import com.example.jdbc.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Date:2021/02_2:00 下午
 * @Description：
 */
@Repository
public class AdminDaoImpl implements AdminDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(Admin admin) {
        String sql = "insert into t3 values(?,?,?)";
        jdbcTemplate.update(sql,null,admin.getName(),admin.getPass());
    }

    public void delete(Integer id){
        String sql = "delete from t3 where id = ?";
        jdbcTemplate.update(sql,id);
    }

    public void update(Admin admin,Integer id){
        String sql = "update t3 set name =  ?,pass = ? where id = ?";
        jdbcTemplate.update(sql,admin.getName(),admin.getPass(),id);
    }

    public Admin findOne(Integer id){
        String sql = "select * from t3 where id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Admin>(Admin.class),id);
    }

    public List<Admin> findAll(){
        String sql = "select * from t3";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Admin>(Admin.class));
    }
}
