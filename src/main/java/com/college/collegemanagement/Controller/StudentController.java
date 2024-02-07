package com.college.collegemanagement.Controller;

import com.college.collegemanagement.Entity.Student;
import com.college.collegemanagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping()
    public Flux<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @GetMapping("/{id}")
    public Mono<Student> getStudentsById(@PathVariable int id){
        return studentService.getStudentById(id);
    }


}
