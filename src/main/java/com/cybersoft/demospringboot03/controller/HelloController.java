package com.cybersoft.demospringboot03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    @Controller: định nghĩa đường dẫn mà nội dung đường dẫn trả ra file Html
    @ResponseBody: Giúp cho @Controller có thể trả ả kiểu String dùng để viết API
    @RestController: là sự kết hợp của @Controller va @ResponseBody
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello() {
        return "Hello String boot";
    }

    @PostMapping ("/cybersoft")
    public String helloCybersoft () {
        return "Hello Spring Cybersoft";
    }
}
