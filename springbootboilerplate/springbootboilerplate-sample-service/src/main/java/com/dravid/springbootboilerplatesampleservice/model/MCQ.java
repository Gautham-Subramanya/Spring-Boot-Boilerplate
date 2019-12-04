package com.dravid.springbootboilerplatesampleservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="questions")
public class MCQ extends Questions {

    private String[] options;
    private String answer;


}
