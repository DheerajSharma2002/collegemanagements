package com.college.collegemanagement.Service;

import com.college.collegemanagement.Entity.Student;
import com.college.collegemanagement.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class StudentService {

    @Autowired
    private  StudentRepository studentRepository;

    public Mono<Student> createStudent(Student student){
        return studentRepository.save(student);
    }



    public Flux<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Mono<Student> getStudentById(int id){
        return studentRepository.findById(id);
    }

    public Mono<Student> updateStudentById(Integer id, Student student){
        return studentRepository.findById(id).flatMap(dbStudent -> {dbStudent.setName(student.getName());
            dbStudent.setAddress(student.getAddress());
         return studentRepository.save(dbStudent);
        });
    }

    public Mono<Void> deleteStudent(Integer id){
        return studentRepository.deleteById(id);

    }
}
