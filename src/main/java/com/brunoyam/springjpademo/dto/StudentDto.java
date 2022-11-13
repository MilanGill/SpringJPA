package com.brunoyam.springjpademo.dto;

import com.brunoyam.springjpademo.model.Student;
import lombok.Data;

@Data
public class StudentDto  {
    private Long id;
    private Integer age;
    private String name;
}
