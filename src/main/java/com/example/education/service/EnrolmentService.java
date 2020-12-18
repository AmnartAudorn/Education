package com.example.education.service;

import com.example.education.dto.GetEnrolmentStuDto;
import com.example.education.entity.Enrolment;
import com.example.education.entity.Student;
import com.example.education.entity.Subject;
import javassist.NotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EnrolmentService {
    List<Enrolment> findAll();
    Enrolment CreateEnrolment(Integer stuId,String subjId) throws NotFoundException;
    List<Enrolment> getStudentId(int stuId);
}
