package com.wecp.progressive.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Teacher;
import com.wecp.progressive.repository.TeacherRepository;
import com.wecp.progressive.service.TeacherService;

@Service
public class TeacherServiceImplJpa implements TeacherService {
    TeacherRepository teacherRepository;
    
    public TeacherServiceImplJpa(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Integer addTeacher(Teacher teacher) throws Exception {
        // List<Teacher> teacherList= teacherRepository.findAll();

        // for(Teacher t: teacherList)
        // {
        //     if(t.getFullName())
        // }
        Teacher t1= teacherRepository.save(teacher);
        return t1.getTeacherId();
    }

    @Override
    public List<Teacher> getAllTeachers() throws Exception {
        return teacherRepository.findAll();
    }
    public Teacher getTeacherById(int teacherId) throws Exception
    {
        return teacherRepository.findById(teacherId).get();
    }
    public void deleteTeacher(int teacherId)throws Exception
    {
        if(getTeacherById(teacherId)!=null)
        deleteTeacher(teacherId);
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() throws Exception {
        return null;
    }
    public void updateTeacher(Teacher teacher)
    {
        teacherRepository.save(teacher);
    }
    


}