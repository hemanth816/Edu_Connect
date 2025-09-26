package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.dao.StudentDAO;
import com.wecp.progressive.dao.StudentDAOImpl;
import com.wecp.progressive.entity.Student;
import com.wecp.progressive.service.StudentService;

public class StudentServiceImplJdbc implements StudentService {

    private StudentDAO studentDAO;
    
    public StudentServiceImplJdbc(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public Integer addStudent(Student student) throws Exception {
        // TODO Auto-generated method stub
        try {
            return studentDAO.addStudent(student);
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        //throw new Exception("Method not working");
        return null;
        
        
    }

    @Override
    public void deleteStudent(int studentId) throws Exception {
        // TODO Auto-generated method stub
       // StudentService.super.deleteStudent(studentId);
       try {
        studentDAO.deleteStudent(studentId);
            
       } catch (SQLException e) {
           // TODO: handle exception
           e.printStackTrace();
       }
       //throw new Exception("Method not working");
    }

    @Override
    public List<Student> getAllStudentSortedByName() throws Exception {
        // TODO Auto-generated method stub
        List<Student> li=new ArrayList<>();
        try {
            li=studentDAO.getAllStudents();
            Collections.sort(li);
            return li;



        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        //throw new Exception("Method not working");
        return li;
    }

    @Override
    public List<Student> getAllStudents() throws Exception {
        // TODO Auto-generated method stub
        try {
            return studentDAO.getAllStudents();
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        //throw new Exception("Method not working");
        return null;
    }

    @Override
    public Student getStudentById(int studentId) throws Exception {
        // TODO Auto-generated method stub
     //return StudentService.super.getStudentById(studentId);
     try {
        return studentDAO.getStudentById(studentId);            
     } catch (SQLException e) {
         // TODO: handle exception
         e.printStackTrace();
     }
     //throw new Exception("Method not working");
     return null;
    }

    @Override
    public void updateStudent(Student student) throws Exception {
        // TODO Auto-generated method stub
       // StudentService.super.updateStudent(student);
       try {
            studentDAO.updateStudent(student);
       } catch (SQLException e) {
           // TODO: handle exception
           e.printStackTrace();
       }
       //throw new Exception("Method not working");
    }
    
}