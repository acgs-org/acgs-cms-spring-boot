package org.acgs.cms.controller;

import org.acgs.cms.dto.LoginDTO;
import org.acgs.cms.dto.RegisterDTO;
import org.acgs.cms.entity.User;
import org.acgs.cms.repository.UserRepository;
import org.acgs.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @Author John@acgs-org
 * @Date 2021/4/19
 */
@RestController
@RequestMapping("/cms/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody @Validated RegisterDTO validator) {
        userService.createUser(validator);
    }

    @PostMapping("/login")
    public void login(@RequestBody @Validated LoginDTO validator) {
        Optional<User> user = userService.getUserByUserName(validator);
        if (user.isPresent()) {
            System.out.println(user);
        } else {
            System.out.println("user not exist");
        }
    }

    @PostMapping("/add")
    public void insert() {
        User user = new User();
        user.setUsername("root");
        user.setPassword("123456");
        user.setEmail("123456@qq.com");
        userRepository.save(user);
    }

    @PostMapping("/delete")
    public void delete() {
        userRepository.deleteAll();
    }

    @GetMapping("")
    public List<User> findAllUser() {
//        return userService.findAllUser();
        return userRepository.findAll();
    }

//    public
}
