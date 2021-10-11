package com.StudentDetails.demo;
    
import org.springframework.data.repository.CrudRepository;//easy to interact a DB and using interface a spring Data generic a CRUD
     
public interface StudentRepository extends CrudRepository<Student, Integer>{}


