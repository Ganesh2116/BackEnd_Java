package String;

//enif ma i
//* fine am i
//* i ma enif

public class reverseString {
	
	void reverse(String str)
	{
		// 1st 
		for (int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		String []st = str.split(" ");
		System.out.println();
		
		// 2nd
		for (int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]+" ");
		}
		System.out.println();
		
		//3rd
		for (int i=0;i<st.length;i++)
		{
			for (int j=st[i].length()-1;j>=0;j--)
			{
				System.out.print(st[i].charAt(j));
			}
			System.out.print(" ");

		}
		
		
	}
	
	public static void main(String[] args) {
		reverseString obj = new reverseString();
		String str = "i am fine";
		obj.reverse(str);
	}

}
