package com.dravid.springbootboilerplatesampleservice.controller;

import com.dravid.springbootboilerplatesampleservice.model.QuestionType;
import com.dravid.springbootboilerplatesampleservice.respository.GenericRepository;
import com.fasterxml.classmate.GenericType;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @Autowired
    Environment environment;

    @Autowired
    GenericRepository genericRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from: " + environment.getProperty("server.port");
    }

    @PostMapping("/question")
    public ResponseEntity<?> addQuestion(@RequestBody() QuestionType jsonObject) {
       System.out.println("This is inside question" + jsonObject);
//        genericRepository.save(jsonObject);
        return ResponseEntity.ok(genericRepository.save(jsonObject));
    }
}
