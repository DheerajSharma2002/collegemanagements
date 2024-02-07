package com.college.collegemanagement.Repository;

import com.college.collegemanagement.Entity.Student;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface StudentRepository  extends ReactiveMongoRepository<Student, Integer> {
     Flux<Student> findAllByName(String name);
}
