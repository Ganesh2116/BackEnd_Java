package encapsulation.pkg;

import java.util.Scanner;

/*
 Design a Book class with private attributes title and author. 
 Allow setting and retrieving values using methods.
 */

public class Question06 {
	
	private String title;
	private String auther;
	
	Question06(String title,String auther)
	{
		this.title = title;
		this.auther = auther;
		
	}
	
	public String getTitleAuther()
	{
		return "Title is "+title+" and auther name is "+auther;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter titile and auther name ");
		String title = sc.next();
		String auther = sc.next();
		
		Question06 obj = new Question06(title, auther);
		
		System.out.println(obj.getTitleAuther());
	}
	

}
