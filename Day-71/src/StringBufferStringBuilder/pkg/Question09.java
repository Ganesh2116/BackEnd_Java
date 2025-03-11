package StringBufferStringBuilder.pkg;

// 9. Ensure the capacity of a StringBuffer is at least 100 and print the new capacity.  

	public class Question09 {
		
		void print()
		{
			StringBuffer str =  new StringBuffer(110);
			
			System.out.println("capacity of buffer is :"+str.capacity());
		}
		
		public static void main(String[] args) {
			Question09 obj = new Question09();
			obj.print();
			
		}

	}


