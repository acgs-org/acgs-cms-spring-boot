package org.acgs.cms.repository;

import org.acgs.cms.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author John@acgs-org
 * @Date 2021/4/24
 */
public interface BookRepository extends MongoRepository<Book, String> {
}
