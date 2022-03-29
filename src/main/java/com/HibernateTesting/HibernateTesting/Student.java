package com.HibernateTesting.HibernateTesting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Student_Data")
public class Student {
@Id
private int sid;
//@Transient
private String sname;
@Column(name="Student_color")
private String colour;

public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", colour=" + colour + "]";
}
}
