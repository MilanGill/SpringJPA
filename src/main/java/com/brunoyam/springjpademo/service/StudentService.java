package com.brunoyam.springjpademo.service;


import com.brunoyam.springjpademo.dto.StudentDto;

import java.util.List;

public interface StudentService {
        List<StudentDto> getStudents();

        StudentDto getStudent(Long id);

        void addStudent(StudentDto studentDto);

        void updateStudent(Long id, StudentDto studentDto);
}
