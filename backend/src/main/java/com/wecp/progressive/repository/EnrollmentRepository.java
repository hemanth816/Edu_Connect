package com.wecp.progressive.repository;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Enrollment;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment,Integer>{
    // Optional<Enrollment> findByStudent_StudentAndCourse_CourseId(int studentId,int courseId);
    // List<Enrollment> findAllByStudent_StudentId(int studentId);
    // List<Enrollment> findAllByCourse_CourseId(int courseId);
    // void deleteByCourseId(int courseId);
    // void deleteByStudentId(int courseId);
    // void deleteByTeacherId(int teacherId);
=======

public interface EnrollmentRepository {
>>>>>>> f55bf55e462e4faaa809ff6a4f28c9749421a7f1
}
