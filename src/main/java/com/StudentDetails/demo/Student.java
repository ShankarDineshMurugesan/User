package com.StudentDetails.demo;

import java.io.Serializable;//marker interface does not have a methods and field,implementing classes without method,byte stream,OOS,deserialization OIS

import javax.persistence.Column;//mapped a column javax.persistance (JP API)Jar file import a project
import javax.persistence.Entity;//pointing the table cells
import javax.persistence.Id;//set a key
import javax.persistence.Table;//create a table or table activity


@Entity//moving cells
@Table(name="StudentDatabase")//create the table name
public class Student implements Serializable//class and serialization
{	
@Id//primary key
private int id;
@Column(name="name")//defining name
private String name;
@Column(name="age")
private int age;


public Student()//constructor
{

}


public Student(int age,String name)//passing
{
super();//super - refer a parent class instance variable 
this.age=age;//this - reference variable that refers to the current object.
this.name = name;
}


//getters and setters for id,name and age
public int getId()
{
return id;
}
public void setId(int id)
{
this.id = id;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}
public int getAge()
{
return age;
}
public void setAge(int age)
{
this.age = age;
}
}