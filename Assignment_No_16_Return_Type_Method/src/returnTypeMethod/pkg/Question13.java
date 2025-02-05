package returnTypeMethod.pkg;

// .Write a method to find the cube of a given number

public class Question13 {
	
	int checkCube(int num)
	{
		int cube = num*num*num;
		return cube;
	}
	
	public static void main(String[] args) {
		
		Question13 obj = new Question13();
		int result = obj.checkCube(5);
		
		System.out.println("Cube is this number is :"+result);
	}

}
