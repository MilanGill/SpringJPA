package com.brunoyam.springjpademo.controller;

import com.brunoyam.springjpademo.dto.StudentDto;
import com.brunoyam.springjpademo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/Students")
    public List<StudentDto> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/Students")
    public void addStudent(@RequestBody StudentDto studentDto){
        studentService.addStudent(studentDto);
    }
}
