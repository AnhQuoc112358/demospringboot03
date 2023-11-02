package com.cybersoft.demospringboot03.controller;

import com.cybersoft.demospringboot03.payload.request.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
    @Controller: định nghĩa đường dẫn mà nội dung đường dẫn trả ra file Html
    @ResponseBody: Giúp cho @Controller có thể trả ả kiểu String dùng để viết API
    @RestController: là sự kết hợp của @Controller va @ResponseBody

    tham ố truyền trên trình duyệt  @RequestParam
    tham số truyền ngầm              @RequestParam
    tham số đóng vai trò như đường dẫn    @PathVariable
    tham số là đối tượng                    @RequestBody
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello(@RequestParam String hoten, @RequestParam int tuoi) {
        return "Hello Spring boot " + hoten + "  tuoi: " + tuoi;
    }

    @PostMapping("/cybersoft")
    public String helloCybersoft(@RequestBody LoginRequest loginRequest) {
        return "Hello Spring Cybersoft RequestBody " + loginRequest.getUsername() + " "
                + loginRequest.getPassword();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id ) {
        return new ResponseEntity<>("Update " + id, HttpStatus.OK);
    }
}

