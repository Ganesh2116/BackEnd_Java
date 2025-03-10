package String;

public class equals {
	
	void check()
	{
		String s = "NM";
		String s1 = "NM";
		
		String s2 = new String("NM");
		String s3 = new String("NM");
		
		System.out.println(s.equals(s1));
		System.out.println(s2.equals(s3));
		System.out.println(s.equals(s3));
		System.out.println(s1 == s2);
		System.out.println(s == s1);
	}
	
	public static void main(String[] args) {
		equals obj = new equals();
		obj.check();
	}

}
