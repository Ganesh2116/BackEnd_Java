package pollymorphism.pkg;

/*
 Write a Java program to create a base class Sports with a method called play().
  Create three subclasses: Football, Basketball, and Rugby. Override the play() 
  method in each subclass to play a specific statement for each sport.
 */

class Sports
{
	void play()
	{
		System.out.println("play games..");
	}
}


class Football extends Sports
{
	void play()
	{
		System.out.println("play Football");
	}
}
class Basketball extends Football
{
	void play()
	{
		System.out.println("play Basketball");
	}
}
class Rugby extends Basketball
{
	void play()
	{
		System.out.println("play Rugby");
	}
}

public class Question05 {
	public static void main(String[] args) {
		Sports obj ;
		obj = new Sports();
		obj.play();
		
		obj = new Football();
		obj.play();
		
		obj = new Basketball();
		obj.play();
		
		obj = new Rugby();
		obj.play();
	
		
	}
}
