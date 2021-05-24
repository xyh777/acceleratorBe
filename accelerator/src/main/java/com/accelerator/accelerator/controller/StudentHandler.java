package com.accelerator.accelerator.controller;

import com.accelerator.accelerator.entity.Student;
import com.accelerator.accelerator.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentRepository.findAll();
    }
}
