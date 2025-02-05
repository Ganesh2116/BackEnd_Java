package noreturnwithparameter.pkg;

public class Addition {
	
	void addtion(int a,int b)
	{
		int c = a+ b;
		
		System.out.println("Additon is :"+c);
	}
	
	void print(int  ln,char ch,float rn,double pn,String st) 
	{
		System.out.println("long no "+ln);
		System.out.println("ch "+ch);
		System.out.println("roll no  "+rn);
		System.out.println("point no "+pn);
		System.out.println("String "+st);
	}
	public static void main(String[] args) {
		int d = 10;int g= 20;
		char gn = 'G';
		String st = "ganesh";
		float fl = 2.6f;
		double dg = 2.30;
		
		
		Addition ad = new Addition();
		ad.addtion(d, g);
		ad.print(g, gn, fl, dg, st);
	}
}
