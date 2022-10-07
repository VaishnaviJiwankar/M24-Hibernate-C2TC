package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		
		Student s=new Student();
		
		//create Operation
		s.setstudentid(101);
		s.setname("Rani");
	service.addStudent(s);
		
		 
//	/*create Operation
//		s.setstudentid(101);
//		s.setname(Aditya);
//		service.addStudent(s);
//		
	/*
		//retrieve data
		s=service.getStudentById(101);
		System.out.println("Student Roll No: "+s.getRollno());
		System.out.println("Student Name: "+s.getName());
		*/
	/*
		//update
		s=service.getStudentById(102);
		s.setName("VAISHNAVI");
		service.updateStudent(s);
		*/
		
	   
		//delete
//		s=service.getStudentById(0);
//		service.deleteStudent("Vaishnavi");
//		System.out.println("DATA DELETED");
//		
//		System.out.println("executed");


	}

}
