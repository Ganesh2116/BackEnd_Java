package ArraysQuestions.pkg;

//Create an Employee class with attributes name, id, and salary. Create an array of Employee objects and find the employee with the highest salary.

class Employee 
{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) 
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() 
    {
        System.out.println("Name = " + name + ", ID = " + id + ", Salary = " + salary);
    }

    double getSalary() {
        return this.salary;
    }

    static void printHighestPaidEmployee(Employee[] employees) 
    {
        Employee highestPaid = employees[0];
        for (Employee emp : employees) {
            if (emp.getSalary() > highestPaid.getSalary()) {
                highestPaid = emp;
            }
        }
        System.out.println("\nEmployee with the highest salary:");
        highestPaid.display();
    }
}

public class Question04 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ganesh", 1001, 75000);
        employees[1] = new Employee("Labesh", 1002, 68000);
        employees[2] = new Employee("Shubham", 1003, 92000);
        employees[3] = new Employee("Rushi", 1004, 65000);
        employees[4] = new Employee("Rohit", 1005, 88000);

        for (Employee emp : employees) {
            emp.display();
        }

        Employee.printHighestPaidEmployee(employees);
    }
}

