package abstarction.pkg;

/*
 Create an abstract class Ticket with an abstract method getPrice(). 
 Implement subclasses MovieTicket and TrainTicket that override this method.
 */

abstract class Ticket
{
	abstract void getPrices();
}

class MovieTicket extends Ticket
{
	void getPrices()
	{
		System.out.println("Movies ticket prices is 500 ");
	}
}

class TrainTicket extends Ticket
{
	void getPrices()
	{
		System.out.println("Train ticket prices is 1000 ");
	}
}
public class Question13 {
	public static void main(String[] args) {
		MovieTicket obj = new MovieTicket();
		obj.getPrices();
		TrainTicket obj1 = new TrainTicket();
		obj1.getPrices();
	}

}
