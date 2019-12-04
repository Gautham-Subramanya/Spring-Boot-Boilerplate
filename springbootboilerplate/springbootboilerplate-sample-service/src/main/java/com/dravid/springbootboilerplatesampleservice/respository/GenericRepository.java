package com.dravid.springbootboilerplatesampleservice.respository;

import com.dravid.springbootboilerplatesampleservice.model.QuestionType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository<T> extends MongoRepository<QuestionType, String> {
}
