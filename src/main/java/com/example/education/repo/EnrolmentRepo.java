package com.example.education.repo;

import com.example.education.entity.Enrolment;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EnrolmentRepo extends JpaRepository<Enrolment,Long> {

}
