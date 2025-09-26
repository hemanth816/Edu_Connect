package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Teacher;
import com.wecp.progressive.service.TeacherService;

public class TeacherServiceImplArraylist implements TeacherService  {

    private static List<Teacher> teacherList = new ArrayList<>();

    @Override
    public Integer addTeacher(Teacher teacher) {
        // TODO Auto-generated method stub
        teacherList.add(teacher);
        return teacherList.size();
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        // TeacherService.super.emptyArrayList();
        teacherList=new ArrayList<>();
    }

    @Override
    public List<Teacher> getAllTeachers() {
        // TODO Auto-generated method stub
        Collections.sort(teacherList);
        return teacherList;
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() {
        // TODO Auto-generated method stub
        Collections.sort(teacherList);
        return teacherList;
    }
    

}