package com.lix.web.service;

import com.test.User;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service
@Data
public class UserService {
    String name="1";

    public UserService(String s) {
        this.name=s;
    }
    public UserService(){}
    public void test() {
        System.out.println("this is a service");
    }
}
