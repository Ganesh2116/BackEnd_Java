package abstarction.pkg;

/*
 Develop an abstract class StorageDevice with an abstract method readData(). 
 Implement subclasses HardDrive and PenDrive that override this method.
 */

abstract class StorageDevice 
{
	abstract void readData();
}

class HardDrive extends StorageDevice
{
	void readData()
	{
		System.out.println("hard drive: get data store data read data");
	}
}

class PenDrive extends StorageDevice
{
	void readData()
	{
		System.out.println("Pendrive: get data and store data");
	}
}
public class Question15 {
	public static void main(String[] args) {
		HardDrive obj = new HardDrive();
		obj.readData();
		PenDrive ob = new PenDrive();
		ob.readData();
	}

}
