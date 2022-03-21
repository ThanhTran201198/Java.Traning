package fis.java.topic01.practice01;

import java.sql.Date;
import java.util.Collections;

public class Student implements Comparable<Student>{
	private int code;
	private String name;
	private Date birthDay;
	public Student() {
		super();
	}
	public Student(int code, String name, Date birthDay) {
		super();
		this.code = code;
		this.name = name;
		this.birthDay = birthDay;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", birthDay=" + birthDay + ", getCode()=" + getCode()
				+ ", getName()=" + getName() + ", getBirthDay()=" + getBirthDay() + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int a = this.name.compareTo(o.name) ;
		System.out.println("this.name :"+this.name+"| o.name :"+o.name+"| kq :"+a);
		return a;
	}
	
		
	
}
