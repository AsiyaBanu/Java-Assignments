package com.associationAssignment;

public class TestMain {

	public static void main(String[] args) {
		UndergradStudent u1=new UndergradStudent();
		u1.setName("Divya");
		u1.setRollno(12);
		u1.setCity("Tumkur");
		System.out.println("**********Student 1 Details************");
		System.out.println("Name of the Student:"+u1.getName());
		System.out.println("Roll No. of the Student:"+u1.getRollno());
		System.out.println("City of the Student:"+u1.getCity());
		u1.setYear(2017);
		System.out.println("Year of Admission:"+u1.getYear());
		u1.hasBranch();
		u1.hasSociety();
		
		UndergradStudent u2=new UndergradStudent();
		u2.setName("Samaira");
		u2.setRollno(55);
		u2.setCity("Delhi");
		System.out.println("**********Student 2 Details************");
		System.out.println("Name of the Student:"+u2.getName());
		System.out.println("Roll No. of the Student:"+u2.getRollno());
		System.out.println("City of the Student:"+u2.getCity());
		u2.setYear(2018);
		System.out.println("Year of Admission:"+u2.getYear());
		u2.hasBranch();
		u2.hasSociety();

	}

}
