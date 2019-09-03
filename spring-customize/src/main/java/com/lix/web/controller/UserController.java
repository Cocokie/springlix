package com.lix.web.controller;

import com.lix.web.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
@Data
public class UserController {
    @Qualifier("userService")
    @Autowired(required = false)
    private UserService userService2;

    public void test() {
        System.out.println(userService2);
        userService2.test();
        System.out.println("this is a controller");
    }
}
