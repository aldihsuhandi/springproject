package com.project.webproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public interface UserController {

    @RequestMapping("/register")
    String create(@RequestParam(value = "request") String request);

    @RequestMapping("/update")
    String update(@RequestParam(value = "request") String request);
}
