package weeklyTest.pkg;
/*
 2. Create a class Person with a default constructor and a parameterized constructor 
 that takes name and age. Create two objects using both constructors and display their 
 details.
 */

class Person {
    Person() 
    {
        System.out.println("This is a no-parameter constructor");
    }

 
    Person(String name) 
    {
        System.out.println("Name is " + name);
    }

   
    Person(int age) 
    {
        System.out.println("Age is " + age);
    }
}

public class Question02 {
    public static void main(String[] args) {
 
        Person obj = new Person();
        Person obj1 = new Person("Ganesh");
        Person obj2 = new Person(22);
    }
}

