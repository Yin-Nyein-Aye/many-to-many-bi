package com.solt.demo.demo.manytomanydemo.repository;

import com.solt.demo.demo.manytomanydemo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
