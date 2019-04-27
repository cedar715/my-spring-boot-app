package org.jai.spring.firstspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "JaiGanesh! Sri Rama Jayam!! \n Greetings from Spring Boot!";
    }
}
