package com.dravid.springbootboilerplatesampleservice.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "questions")
public class QuestionType implements IQuestion{
    public String questionId;
}
