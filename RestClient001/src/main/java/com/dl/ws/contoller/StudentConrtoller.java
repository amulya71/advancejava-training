package com.dl.ws.contoller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dl.ws.models.StudentModel;
import com.dl.ws.service.StudentService;

@RestController
@RequestMapping(path = "/springbootrest/students")
public class StudentConrtoller {

    @Autowired
    private StudentService studentService;
    
    // Get single Student
    @GetMapping(value = "/student", produces = MediaType.APPLICATION_JSON)
    public String getStudent() {
        return studentService.getStudent();
    }
    
    
    // Get List of Students
    @GetMapping(value = "/studentlist", produces = MediaType.APPLICATION_JSON)
    public List<String> getStudentList() {
        return studentService.getStudentList();
    }
    
    // Get StudentModel
    @GetMapping(value = "/studentmodel", produces = MediaType.APPLICATION_JSON)
    public StudentModel getStudentModel() {
        return studentService.getStudentModel();
    }
    
    // get mapped List of Students
    @GetMapping(value = "/studentmodellist", produces = MediaType.APPLICATION_JSON)
    public List<StudentModel> getStudentModelList() {
        return studentService.getStudentModelList();
    }
    
    
    @GetMapping(value = "/studentbyid", produces = MediaType.APPLICATION_JSON)
    public StudentModel getStudentBySerialNumber(@RequestParam(value="id", defaultValue = "1") int id ) {
        return studentService.getStudentBySerialNumber(id);
    }
    
    
    
}
