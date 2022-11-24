package com.example.hostel.service;

import com.example.hostel.entity.StudentInfo;
import com.example.hostel.service.ServiceImpl;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service implements ServiceImpl {
    List<StudentInfo> studentList= new ArrayList<>();
    public Service(){
        studentList.add(new StudentInfo(10,"Adarsh",101));
        studentList.add(new StudentInfo(11,"Abhilash",102));
        studentList.add(new StudentInfo(12,"Mahesh",103));
        studentList.add(new StudentInfo(13,"shweta",104));
    }
    @Override
    public List<StudentInfo> getStudents() {
        return studentList;
    }
@Override
    public String addStudent(StudentInfo student){
       // StudentInfo studentDetails= new StudentInfo();
       studentList.add(student);
        return "Student Added";
    }
@Override
    public String removeStudent(int StudentId){
       List <StudentInfo>student=new ArrayList<>();
       for(StudentInfo student1:studentList){
           if(student1.getStudentId()==StudentId) {
           studentList.remove(StudentId);
           }
       }
       return "Student Deleted";
    }

    @Override
    public StudentInfo updateStudentRoom(int StudentId, int RoomNo) {
        for (StudentInfo student : studentList) {
            if (student.getStudentId() == StudentId) {
                student.setRoomNo(RoomNo);
               return student;
            }

        }
        return null;
    }

}

