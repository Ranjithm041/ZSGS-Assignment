/*
 * 
 * 1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'.
 *  Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
 * 
 * 
 */

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("John", 2);   // assigned the roll no and name
    }
}

// here i declared the Student class 
class Student{
    String name;
    int roll_no;
    public Student(String name , int roll_no){
        this.name    = name;
        this.roll_no = roll_no;
    }
    {
        System.out.println(" Student Object created successfully !");
    }
}