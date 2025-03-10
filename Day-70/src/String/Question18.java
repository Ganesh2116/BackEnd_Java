package String;

// 18. Split an IP address (e.g., "192.168.1.1") and print each section separately.  


public class Question18 {
	
	String ip ="192.168.1.1";
	
	void ipAddress()
	{
		String s[] = ip.split("\\.");
		System.out.println("Parts of IP address");
		for (int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	
	
	public static void main(String[] args) {
		Question18 obj = new Question18();
		obj.ipAddress();
	}

}
