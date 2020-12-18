package com.example.education.impl;

import com.example.education.dto.GetEnrolmentStuDto;
import com.example.education.entity.Enrolment;
import com.example.education.entity.Student;
import com.example.education.entity.Subject;
import com.example.education.repo.EnrolmentRepo;
import com.example.education.repo.StudentRepo;
import com.example.education.repo.SubjectRepo;
import com.example.education.service.EnrolmentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EnrolmentImpl implements EnrolmentService {
    @Autowired
    EnrolmentRepo enrolmentRepo;

    @Autowired
    SubjectRepo subjectRepo;

    @Autowired
    StudentRepo studentRepo;



    @Override
    public List<Enrolment> findAll() {
        List<Enrolment> enrolments = enrolmentRepo.findAll();
        return enrolments;
    }


    @Override
    public Enrolment CreateEnrolment(Integer stuId,String subjId) throws NotFoundException {
        Subject subj = subjectRepo.findBysubjId(subjId);
        Student stu = studentRepo.findBystuId(stuId);

        Enrolment e = new Enrolment();
        e.setSubject(subj);
        e.setStudent(stu);
        return enrolmentRepo.save(e);
    }

    @Override
    public List<Enrolment> getStudentId(int stuId) {
        List<Enrolment> enrolments = enrolmentRepo.findAll();
        System.out.println(enrolments.size());
        for (Enrolment e : enrolments){
            if(e.getStudent().getStuId() == stuId){
                System.out.println(e.getId());
                System.out.println(e.getStudent().getStuId());
                return enrolments;
            }else{
                return null;
            }
        }
        return enrolments;
    }


}
