package com.lix.web.service;

import com.test.User;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Data
public class UserService {
    String name = "1";
    @Autowired
    JdbcTemplate jdbcTemplate;

    public UserService(String s) {
        this.name = s;
    }

    public UserService() {
    }

    public void test() {
        System.out.println("this is a service");
    }


    @Transactional
    public void insertUser() {
        String sql ="INSERT INTO mybatis (id,NAME,username,PASSWORD) VALUES(?,?,?,?)";
        jdbcTemplate.update(sql,66,"百合折","lixin","123");
        int k=1/0;
    }
}
