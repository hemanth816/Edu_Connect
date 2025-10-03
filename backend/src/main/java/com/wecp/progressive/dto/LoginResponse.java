package com.wecp.progressive.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
public class LoginResponse {
    private String token;         // The JWT token issued to the authenticated user.
    private String roles;         // The role(s) assigned to the authenticated user (e.g., STUDENT, TEACHER).
    private Integer userId;       // The unique ID of the authenticated user.
    private Integer studentId;    // The student ID if the user is a student (null otherwise).
    private Integer teacherId;    // The teacher ID if the user is a teacher (null otherwise).
    public LoginResponse(
        @JsonProperty("token") String token,
        @JsonProperty("roles") String roles,
        @JsonProperty("userId") Integer userId,
        @JsonProperty("studentId") Integer studentId,
        @JsonProperty("teacherId") Integer teacherId
    ) {
        this.token = token;
        this.roles = roles;
        this.userId = userId;
        this.studentId = studentId;
        this.teacherId = teacherId;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public String getRoles() {
        return roles;
    }
    public void setRoles(String roles) {
        this.roles = roles;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public Integer getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}
 
