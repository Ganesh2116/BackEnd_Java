package String;

//5. Extract the file name and extension from a file path using split().  


public class Question05 {
	
	void fileNameExtension(String str)
	{
		String st[] = str.split("\\\\");
		
		String s2 = st[st.length-1];
		String s3[] = s2.split("\\.");
		
		System.out.println("File name:"+s3[0]);
		System.out.print("Extension name:"+s3[1]);
	}
	
	public static void main(String[] args) {
		Question05 obj  = new Question05();
		String str = "c:\\ganesh\\download\\codenera.exe";
		obj.fileNameExtension(str);
		
	}

}
