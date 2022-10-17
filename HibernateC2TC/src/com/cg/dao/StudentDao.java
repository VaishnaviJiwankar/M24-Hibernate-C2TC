package com.cg.dao;

import com.cg.entities.Student;

public interface StudentDao 
{
	//abstract method by default
	public abstract void addStudent(Student s);//insert
	public abstract void updateStudent(Student s);
	public abstract void deleteStudent(Student s);
	public abstract Student getStudentById(int rollno);//find
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();

}
