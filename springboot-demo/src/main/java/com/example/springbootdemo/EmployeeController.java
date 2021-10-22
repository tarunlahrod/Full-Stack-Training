package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String helloWithOneParameter(@PathVariable("name") String name) {
        return "Welcome " + name;
    }

    @GetMapping("hello/{name}/{city}")
    public String helloWithTwoParameters(@PathVariable("name") String name, @PathVariable("city") String city){
        return "Myself " + name + ", frofdsafasfm " + city;
    }
}
