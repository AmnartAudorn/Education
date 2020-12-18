package com.example.education.repo;

import com.example.education.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    Student findBystuId(int stuId);
}
