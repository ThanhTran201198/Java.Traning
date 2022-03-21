package fis.java.topic01.practice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Student s1=new Student(1,"a",null);
		Student s2=new Student(2,"c",null);
		Student s3=new Student(3,"b",null);
		Student s4=new Student(4,"b",null);
		List<Student> lisStudents=new ArrayList<Student>();
		lisStudents.add(s1);
		lisStudents.add(s2);
		lisStudents.add(s3);
		lisStudents.add(s4);
		Collections.sort(lisStudents);
		for(Student s:lisStudents) {
			System.out.println(s.getCode());
		}
	}
}
