package com.example.education.repo;

import com.example.education.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SubjectRepo extends JpaRepository<Subject,String> {
    Subject findBysubjId(String subjId);
}
