package throwException.pkg;

// Throw IllegalStateException if withdrawal amount exceeds balance.
public class ClassQuestion06 {

	void exception()
	{
		int balance = 5000;
		int withdrawalAmu = 6000;
		if ( balance <= withdrawalAmu)
		{
			throw new IllegalStateException(" insufficient  balances ");
		}
		
		System.out.println(balance-withdrawalAmu);
	}
	
	public static void main(String[] args) {
		ClassQuestion06 obj = new ClassQuestion06();
		obj.exception();
	}
}
