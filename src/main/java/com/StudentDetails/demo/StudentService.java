package com.StudentDetails.demo;

import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;//multiple setters
import org.springframework.stereotype.Service;//business functionalities

@Service
public class StudentService
{
@Autowired
StudentRepository studentRepository;

public List<Student> getAllStudent()//using list
{
List<Student> students = new ArrayList<Student>();//using arraylist
studentRepository.findAll().forEach(student -> students.add(student));//iterate and lambda
return students;
}
public Student getStudentById(int id)//search by id
{
return studentRepository.findById(id).get();
}
public void saveOrUpdate(Student student)//save or update
{
studentRepository.save(student);
}
public void delete(int id)//delete by id
{
studentRepository.deleteById(id);
}
}