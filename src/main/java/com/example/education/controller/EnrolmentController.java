package com.example.education.controller;

import com.example.education.dto.GetEnrolmentStuDto;
import com.example.education.dto.RequestCreateEnrollmentDto;
import com.example.education.entity.Enrolment;
import com.example.education.service.EnrolmentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("/api/v1")
public class EnrolmentController {

    @Autowired
    EnrolmentService enrolmentService;

    @GetMapping("/searchEnrolment")
    public List<Enrolment> searchEnrolment(){
        return enrolmentService.findAll();
    }

    @PostMapping("/searchStudentEnrolment")
    public List<Enrolment> getStudentId(@RequestBody GetEnrolmentStuDto getEnrolmentStuDto) {
        System.out.println(getEnrolmentStuDto.getStuId());
        return enrolmentService.getStudentId(getEnrolmentStuDto.getStuId());
    }


    @PostMapping("/createEnrolment")
    public Enrolment createEnrolment(@RequestBody RequestCreateEnrollmentDto request) throws NotFoundException {
        return enrolmentService.CreateEnrolment(request.getStuId(),request.getSubjId());
    }
}
