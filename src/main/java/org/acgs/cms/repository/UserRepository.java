package org.acgs.cms.repository;

import cn.hutool.core.lang.ObjectId;
import org.acgs.cms.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author John@acgs-org
 * @Date 2021/4/19
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
