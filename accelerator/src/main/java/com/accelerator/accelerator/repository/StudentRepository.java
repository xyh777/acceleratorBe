package com.accelerator.accelerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.accelerator.accelerator.entity.Student;
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
