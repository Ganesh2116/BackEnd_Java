package String;

//14. Split a paragraph into sentences based on periods (".").  


public class Question14 {
	
	String str = "The internet has revolutionized the way people communicate, work, and access information. With just a few clicks, users can connect with others across the globe, stream content, shop online, and even work remotely. Businesses have embraced digital transformation, using websites and social media to reach wider audiences. However, the rise of the internet also brings challenges, including cybersecurity threats, misinformation, and privacy concerns. It is essential for users to stay informed and practice safe browsing habits. As technology continues to evolve, the internet will play an even greater role in shaping society, driving innovation, and enhancing daily life.";
	
	void sentences()
	{
		String s[] = str.split("\\.\\s*");
		
		for (int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

	public static void main(String[] args) {
		Question14 obj = new Question14();
		obj.sentences();
	
		
	}
}
