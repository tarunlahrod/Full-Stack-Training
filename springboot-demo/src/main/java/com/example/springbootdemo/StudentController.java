package com.example.springbootdemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Naruto", "naruto@gmail.com"));
        students.add(new Student(2, "Sasuke", "sasuke@gmail.com"));
        students.add(new Student(3, "Sakura", "sakura@gmail.com"));
        return students;
    }

    @PostMapping("/students")
    public String createStudent(){
        return "post method";
    }

    @DeleteMapping("/students")
    public String deleteStudent(){
        return "delete method";
    }

    @PutMapping("/students")
    public String updateStudent(){
        return "update student";
    }
}
