package org.acgs.cms.service.impl;

import cn.hutool.core.bean.BeanUtil;
import org.acgs.cms.dto.LoginDTO;
import org.acgs.cms.dto.RegisterDTO;
import org.acgs.cms.entity.User;
import org.acgs.cms.repository.UserRepository;
import org.acgs.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Author John@acgs-org
 * @Date 2021/4/19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(RegisterDTO dto) {
        User user = new User();
        BeanUtil.copyProperties(dto, user);
        if (userRepository.exists(Example.of(user))) {
            // 存在该用户
            return null;
        }
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserByUserName(LoginDTO dto) {
//        userRepository.findOne();
        User user = new User();
        BeanUtil.copyProperties(dto, user);
        if (!userRepository.exists(Example.of(user))) {
            // 不存在该用户
            return null;
        }
        return userRepository.findOne(Example.of(user));
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
