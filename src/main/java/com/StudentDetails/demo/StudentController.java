package com.StudentDetails.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;//multiple setters
import org.springframework.web.bind.annotation.DeleteMapping;//delete a data
import org.springframework.web.bind.annotation.GetMapping;//read a data
import org.springframework.web.bind.annotation.PathVariable;//extract a value from url
import org.springframework.web.bind.annotation.PostMapping;//update a data
import org.springframework.web.bind.annotation.RequestBody;//http request to method parameter or return type
import org.springframework.web.bind.annotation.RestController;//control a rest services


@RestController
public class StudentController
{
@Autowired
StudentService studentService;
@GetMapping("/student")
private List<Student> getAllStudent()
{
return studentService.getAllStudent();
}
@GetMapping("/student/{id}")
private Student getStudent(@PathVariable("id") int id)
{
return studentService.getStudentById(id);
}
@DeleteMapping("/student/{id}")
private void deleteStudent(@PathVariable("id") int id)
{
studentService.delete(id);
}
@PostMapping("/student")
private int saveStudent(@RequestBody Student student)
{
studentService.saveOrUpdate(student);
return student.getId();
}
}