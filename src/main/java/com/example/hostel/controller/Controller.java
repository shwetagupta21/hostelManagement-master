package com.example.hostel.controller;

import com.example.hostel.entity.StudentInfo;
import com.example.hostel.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class Controller {
    @Autowired
    public ServiceImpl service;

    @GetMapping("/Student")
    private List<StudentInfo> getStudents(){
        return this.service.getStudents();
    }

    @PostMapping("/Student/add")
    private String add(@RequestBody StudentInfo student){
        return service.addStudent(student);
    }
   // @DeleteMapping("/Student/delete/{StudentId}")
  //  private StudentInfo deleteByStudentId(@PathVariable int StudentId){
 //       return ";
//    }

     @PutMapping("Student/update/{StudentId}")
    private StudentInfo updateStudentDetail(@PathVariable(value="StudentId") int StudentId,@RequestBody int  RoomNo){
        return  service.updateStudentRoom(StudentId,RoomNo);
     }
}