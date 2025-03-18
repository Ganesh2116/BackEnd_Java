package ArraysQuestions.pkg;

import java.util.Scanner;

//Create a class Student with attributes name, roll number, and marks. Create an array of Student objects and print the details of all students

class Student
{
	private String name;
	private int rollNo;
	private double marks;
	
	public Student()
	{
		Student[] students = new Student[5];
        students[0] = new Student("ganesh", 5001, 84);
        students[1] = new Student("labesh", 5002, 76);
        students[2] = new Student("shubham", 5010, 92);
        students[3] = new Student("rushi", 5015, 65);
        students[4] = new Student("Rohit", 5018, 65);
        
        for(int  i = 0; i < students.length; i++)
        {
        	students[i].display();
        }
	}
	
	public Student(String name, int rollNo, double marks) 
	{
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	void display()
	{
		System.out.println("name = "+name+", Roll No = "+rollNo+" , Marks : "+marks);
	}

}
public class Question01 
{
	public static void main(String[] args) 
	{
		Student std = new Student();	
	}
}