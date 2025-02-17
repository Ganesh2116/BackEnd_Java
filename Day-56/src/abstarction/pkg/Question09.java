package abstarction.pkg;

/*
 Create an abstract class Game with an abstract method play(). 
 Implement subclasses Cricket and Football that override this method.
 */

abstract class Game 
{
	abstract void play();
}

class Circket extends Game
{
	void play()
	{
		System.out.println("play the circket");
	}
}

class Football extends Game
{
	void play()
	{
		System.out.println("Play the football");
	}
}
public class Question09 {
	public static void main(String[] args) {
		Circket obj = new Circket();
		obj.play();
		Football obj1 = new Football();
		obj1.play();
	}

}
