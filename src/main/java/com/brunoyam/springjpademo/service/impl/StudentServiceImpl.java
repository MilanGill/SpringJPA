package com.brunoyam.springjpademo.service.impl;

import com.brunoyam.springjpademo.dto.StudentDto;
import com.brunoyam.springjpademo.model.Student;
import com.brunoyam.springjpademo.repository.StudentRepository;
import com.brunoyam.springjpademo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getStudents() {
        List<Student> students = studentRepository.findAll();
        return  students.stream()
                .map(student -> modelMapper.map(student, StudentDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto getStudent(Long id) {
        return null;
    }

    @Override
    public void addStudent(StudentDto studentDto) {
        Student student = modelMapper.map(studentDto,Student.class);
        studentRepository.save(student);
    }

    @Override
    public void updateStudent(Long id, StudentDto studentDto) {

    }
}
