package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Teacher;
import com.wecp.progressive.service.impl.TeacherServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherServiceImplJpa teacherServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Teacher>> getAllTeachers() {
        try
        {
            return new ResponseEntity<>(teacherServiceImplJpa.getAllTeachers(), HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{teacherId}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable int teacherId) {
        try
        {
            return new ResponseEntity<>(teacherServiceImplJpa.getTeacherById(teacherId), HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }

    public ResponseEntity<Integer> addTeacher(Teacher teacher) {
        try
        {
            return new ResponseEntity<>(teacherServiceImplJpa.addTeacher(teacher), HttpStatus.CREATED);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }

    public ResponseEntity<Void> updateTeacher(int teacherId, Teacher teacher) {
        try
        {
            teacherServiceImplJpa.updateTeacher(teacher);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        
    }

    public ResponseEntity<Void> deleteTeacher(int teacherId) {
        try
        {   
            teacherServiceImplJpa.deleteTeacher(teacherId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        
    }

    public ResponseEntity<List<Teacher>> getTeacherSortedByYearsOfExperience() {
        try
        {

        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return null;
    }
}
