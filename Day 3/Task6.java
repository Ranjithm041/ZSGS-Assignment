/*
 * 
 * ‌
6. Write a program that would print the information (name, year of joining, salary, address) 
of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.
 * 
 * 
 */
public class Task6 {
    public static void main(String[] args) {
        // here i created the employee object for three employees
        Employee robert = new Employee("Robert", 1994, "64C- WallsStreet", 90000);
        Employee sam = new Employee("Sam", 2000, "68D- WallsStreet", 72000);
        Employee john = new Employee("John", 1999, "26B- WallsStreet", 50000);

        // this method will print the each employee details
         System.out.println("Name    | Year of Joining|   salary   |     address      |");
        robert.printDetails();
        sam.printDetails();
        john.printDetails();
    }
}

class Employee{
    //instance varibale
    String name; 
    int yearOfJoining;
    double salary;
    String address;

    //default constructor
    public Employee() {
        System.out.println("The Employee object is created successfully !");
    }

    // parameterilized constructor
    public Employee(String name, int yearOfJoining, String address, double salary) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // here this method will print employee details
   public void printDetails(){
        System.out.printf("%-10s   %-13d %.2f     %-15s \n",this.name,this.yearOfJoining,this.salary,this.address);
    }
}