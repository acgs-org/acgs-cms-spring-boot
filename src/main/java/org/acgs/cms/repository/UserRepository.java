package org.acgs.cms.repository;

import org.acgs.cms.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author John@acgs-org
 * create time 2021/4/30
 */
@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

    boolean existsByUsername(String username);

    User findByUsernameAndPassword(String name, String password);
}
