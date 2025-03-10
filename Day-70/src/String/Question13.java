package String;

// 13. Split a URL into protocol, domain, and path (e.g., "https://www.example.com/home").  


public class Question13 {
	
	String str = "https://www.example.com/home";
	
	void uRLSplit()
	{
		String s[] = str.split("://|/" );
		
		String protocol = s[0];
        String domain = s[1];
        String path = s.length > 2 ? s[2] : "";

        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
		
	}
	
	public static void main(String[] args) {
		Question13 obj = new Question13();
		obj.uRLSplit();
	}

}
