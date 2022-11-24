package com.example.hostel.service;

import com.example.hostel.entity.StudentInfo;

import java.util.List;

public interface ServiceImpl {
    List<StudentInfo> getStudents();
    public String addStudent(StudentInfo student);

   // public String removeStudent(int StudentId);
    public StudentInfo updateStudentRoom(int StudentId, int RoomNo);
}
