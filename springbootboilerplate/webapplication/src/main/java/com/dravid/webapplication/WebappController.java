package com.dravid.webapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebappController {

    @RequestMapping("/")
    public String sample() {
        return "index.html";
    }

}
