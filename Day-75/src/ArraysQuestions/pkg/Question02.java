package ArraysQuestions.pkg;

// Write a Java program to find the student with the highest marks from an array of Student objects.

class Student2 {
    private String name;
    private int rollNo;
    private double marks;

    public Student2() {
        Student2[] students = new Student2[5];
        students[0] = new Student2("Ganesh", 5001, 84);
        students[1] = new Student2("Labesh", 5002, 76);
        students[2] = new Student2("Shubham", 5010, 92);
        students[3] = new Student2("Rushi", 5015, 65);
        students[4] = new Student2("Rohit", 5018, 65);

        for (Student2 student : students) {
            student.display();
        }

        print(students);
    }

    public Student2(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name = " + name + ", Roll No = " + rollNo + " , Marks: " + marks);
    }

    double getMarks() {
        return this.marks;
    }

    void print(Student2[] students) {
        Student2 topStudent = students[0];
        for (Student2 student : students) {
            if (student.getMarks() > topStudent.getMarks()) {
                topStudent = student;
            }
        }

        System.out.println("\nHighest Marks Student:");
        topStudent.display();
    }
}

public class Question02 {
    public static void main(String[] args) {
        new Student2();
    }
}

