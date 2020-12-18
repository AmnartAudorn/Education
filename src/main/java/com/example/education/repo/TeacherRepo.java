package com.example.education.repo;


import com.example.education.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TeacherRepo extends JpaRepository<Teacher,String> {

}
