package com.college.collegemanagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("/student")
public class Student {

    @Id
    private int id;
    private String name;
    private  String address;

    private int mobile_no;
}
