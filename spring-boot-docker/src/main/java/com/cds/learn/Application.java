package com.cds.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cds on 2/18/17 21:57.
 */
public class Application {
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
