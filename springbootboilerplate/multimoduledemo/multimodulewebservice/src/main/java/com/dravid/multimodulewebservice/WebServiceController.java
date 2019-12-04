package com.dravid.multimodulewebservice;

import com.dravid.multimodulecorelib.User;
import com.dravid.multimodulecorelib.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebServiceController {

    @Autowired
    UserService userService;

    @GetMapping("/helloworld")
    public List<User> getUser() {
        return userService.getUser();
    }
}
