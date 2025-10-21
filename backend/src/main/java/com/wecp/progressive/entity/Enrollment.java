package com.wecp.progressive.entity;

import javax.persistence.*;
<<<<<<< HEAD

import com.fasterxml.jackson.annotation.JsonFormat;

=======
>>>>>>> b8a24b8c6f004b95ee97941f899471299f692b28
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "enrollment", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"student_id", "course_id"})
})
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enrollment_id")
    private int enrollmentId;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Column(name = "enrollment_date", nullable = false)
<<<<<<< HEAD
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate enrollmentDate;
=======
    private Date enrollmentDate;
>>>>>>> b8a24b8c6f004b95ee97941f899471299f692b28

    
    public Enrollment() {}

<<<<<<< HEAD
    public Enrollment(Student student, Course course, LocalDate enrollmentDate) {
=======
    public Enrollment(Student student, Course course, Date enrollmentDate) {
>>>>>>> b8a24b8c6f004b95ee97941f899471299f692b28
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

<<<<<<< HEAD
    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
=======
    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
>>>>>>> b8a24b8c6f004b95ee97941f899471299f692b28
        this.enrollmentDate = enrollmentDate;
    }
}
