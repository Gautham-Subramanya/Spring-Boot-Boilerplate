package com.dravid.springbootboilerplatesampleservice.respository;

import com.dravid.springbootboilerplatesampleservice.model.Questions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SampleRepository extends MongoRepository<Questions, Integer> {

}
