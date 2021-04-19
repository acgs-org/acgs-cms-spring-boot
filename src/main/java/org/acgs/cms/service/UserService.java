package org.acgs.cms.service;

import org.acgs.cms.dto.LoginDTO;
import org.acgs.cms.dto.RegisterDTO;
import org.acgs.cms.entity.User;

import java.util.List;
import java.util.Optional;

/**
 * @Author John@acgs-org
 * @Date 2021/4/19
 */
public interface UserService {

    User createUser(RegisterDTO dto);

    Optional<User> getUserByUserName(LoginDTO dto);

    List<User> findAllUser();
}
