package org.acgs.cms.controller.cms;

import cn.hutool.core.bean.BeanUtil;
import org.acgs.cms.dto.LoginDTO;
import org.acgs.cms.dto.RegisterDTO;
import org.acgs.cms.entity.User;
import org.acgs.cms.repository.UserRepository;
import org.acgs.core.token.DoubleJWT;
import org.acgs.core.token.Tokens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author John@acgs-org
 * create time 2021/4/30
 */
@RestController
@RequestMapping("/cms/user")
@Validated
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DoubleJWT jwt;

    /**
     * 用户注册
     */
    @PostMapping("/register")
    public User register(@RequestBody @Validated RegisterDTO validator) {
        boolean exist = userRepository.existsByUsername(validator.getUsername());
        if (exist) {
            System.out.println("用户已存在");
            return null;
        }
        User user = new User();
        BeanUtil.copyProperties(validator, user);
        System.out.println("注册成功！");
        return userRepository.insert(user);
    }

    /**
     * 用户登陆
     */
    @PostMapping("/login")
    public Tokens login(@RequestBody @Validated LoginDTO validator) {
        User user = userRepository.findByUsernameAndPassword(validator.getUsername(), validator.getPassword());
        if (user == null) {
            System.out.println("用户不存在");
            return null;
        }
        System.out.println("登录成功！");
        return jwt.generateTokens(user.getId().toString());
    }

}
