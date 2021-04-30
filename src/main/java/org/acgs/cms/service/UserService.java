package org.acgs.cms.service;

import org.acgs.cms.dto.RegisterDTO;
import org.acgs.cms.entity.User;

/**
 * 用户服务
 *
 * @author John@acgs-org
 * create time 2021/4/30
 */
public interface UserService {

    User createUser(RegisterDTO dto);

}
