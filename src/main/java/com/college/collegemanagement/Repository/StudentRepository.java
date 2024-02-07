package com.college.collegemanagement.Repository;

import com.college.collegemanagement.Entity.Student;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StudentRepository  extends ReactiveMongoRepository<Student, Integer> {
}
