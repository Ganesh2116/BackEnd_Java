package StringBufferStringBuilder.pkg;

public class methods {
	
	void methodsStringBuffer()
	{
		StringBuffer sb = new StringBuffer("ganesh");
		
		System.out.println("String Buffer");
		System.out.println("append :"+sb.append("bharti"));
		System.out.println(sb.insert(2, "bharti"));
		System.out.println("replace :"+sb.replace(2, 5, "bharti"));
		System.out.println("Delete :"+sb.delete(5, 6));
		System.out.println("reverse :"+sb.reverse());
		System.out.println("capecity :"+sb.capacity());
		System.out.println("charAt:"+sb.charAt(5));
		sb.setCharAt(3, 'h');
		System.out.println("SetchatAt:"+sb);
		
		System.out.println("\n\nString builder");
		StringBuilder sb1 = new StringBuilder("bharti");
		System.out.println("append :"+sb1.append("bharti"));
		System.out.println(sb1.insert(2, "bharti"));
		System.out.println("replace :"+sb1.replace(2, 5, "bharti"));
		System.out.println("Delete :"+sb1.delete(5, 6));
		System.out.println("reverse :"+sb1.reverse());
		System.out.println("capecity :"+sb1.capacity());
		System.out.println("charAt:"+sb1.charAt(5));
		sb1.setCharAt(2, 'g');
		System.out.println("setcharAt is:"+sb1);
	}
	
	public static void main(String[] args) {
		methods obj = new methods();
		obj.methodsStringBuffer();
		
	}

}
