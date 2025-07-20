/*
 * 
 * 
 * 3. Write a Java program where you define a class named Employee. Inside the class, 
 * define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and 
sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and 
creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.
 * 
 * 
 * 
 */

public class Task3 {
    public static void main(String[] args) {

        // here i created empty constructor employee object
        Employee emp1 = new Employee(); 
        // here i created parameterized constructor
        Employee emp2 = new Employee("Ranjith", 101, "software developer", 50000);
        // here i copy constructorvalue from emp2
        Employee emp3 = new Employee(emp2); 

        emp1.printDetails(); // print the employee 1 details
        emp2.printDetails(); // print the employee 2 details
        emp3.printDetails(); // print the employee 3 details
    }
}

class Employee{
    //instance varibale
    String name; 
    int empId;
    double salary;
    String designation;

    //default constructor
    public Employee() {
        System.out.println("The Employee object is created successfully !");
    }

    // parameterilized constructor
    public Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.empId = id;
        this.salary = salary;
        this.designation = designation;
    }

    //copy contructer
    public Employee(Employee e){
        this.name        = e.name;
        this.empId       = e.empId;
        this.designation = e.designation;
        this.salary      = e.salary;
    }

    // here this method will print employee details
   public void printDetails(){
        System.out.println("Employee : name : "+this.name+" id : "+this.empId+" salary : "
        +this.salary+" department : "+this.designation);
    }
}