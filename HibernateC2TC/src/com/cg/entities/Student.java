package com.cg.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class Student implements Serializable {
private static final long serialVersionUID = 1L;
//primary key
@Id
private int studentid;
private String name;
public int getStudentid() {
return studentid;
}
public void setstudentid(int studentId) {
this.studentid = studentid;
}
public String getname() {
return name;
}
public void setname(String name) {
this.name = name;
}
}