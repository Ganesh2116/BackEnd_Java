package abstarction.pkg;

/*
 Develop an abstract class MusicalInstrument with an abstract method playSound(). 
 Implement subclasses Guitar and Piano that override this method.
 */

abstract class MusicalInstrument 
{
	abstract void playSound();
}

class Guitar extends MusicalInstrument
{
	void playSound()
	{
		System.out.println("Guitar sound");
	}
}

class Piano extends MusicalInstrument
{
	void playSound()
	{
		System.out.println("piano sound");
	}
}
public class Question11 {
	public static void main(String[] args) {
		Guitar obj = new Guitar();
		obj.playSound();
		Piano obj1 = new Piano();
		obj1.playSound();
	}

}
