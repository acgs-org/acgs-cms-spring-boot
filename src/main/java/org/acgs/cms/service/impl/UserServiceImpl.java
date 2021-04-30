package org.acgs.cms.service.impl;

import cn.hutool.core.bean.BeanUtil;
import org.acgs.cms.dto.RegisterDTO;
import org.acgs.cms.entity.User;
import org.acgs.cms.repository.UserRepository;
import org.acgs.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author John@acgs-org
 * create time 2021/4/30
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(RegisterDTO dto) {
        boolean exist = userRepository.existsByUsername(dto.getUsername());
        if (exist) {
            return null;
        }
        User user = new User();
        BeanUtil.copyProperties(dto, user);
        return userRepository.save(user);
    }
}
