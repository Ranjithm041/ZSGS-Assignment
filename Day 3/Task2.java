/*
 * 
 * 2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and
 store and display the details for two students having names "Sam" and "John" respectively.
 * 
 * 
 * 
 * 
 */

public class Task2 {
    public static void main(String[] args) {

        // i here initialized the object for student class with respective value
        Student sam = new Student("Sam", 101, 1203456789, "11/2 Mathalamparai, tenkasi");
        Student john = new Student("John", 102, 1234567890, "11/22 Mathalamparai, tenkasi");

        //this method invoke will print the details of the student
        sam.displayDetails();
        john.displayDetails();
    }
}

class Student{
    String name;
    int roll_no;
    int phone_no;
    String address;

    public Student(){
        // this is the default constructor for avoid the error when crreating the object with empty constructor
    }
    // here i inialize the parameterized constructor
    public Student(String name , int roll_no, int phone_no, String address){
        this.name    = name;
        this.roll_no = roll_no;
        this.phone_no= phone_no;
        this.address = address;
    }

    //this method will print the details of the student
    public void displayDetails(){
        System.out.println(
            "Student : "+" name : "+this.name+" roll number : "+this.roll_no+" phone number : "+this.phone_no+
            "address : "+this.address
        );
    }
}
