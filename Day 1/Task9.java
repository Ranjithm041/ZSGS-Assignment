/*

9. Write a class Employee with attributes empId, name, department and salary and define
   a parametrized constructor Employee(int empId, String name, String department, double salary)
   and assign these variables to instance variables accordingly and display them?

*/ 

public class Task9{
   public static void main(String[] args) {
       Employee employee = new Employee("Ranjith",104,"Software Developer",40000);
       employee.printDetails();
   }   
}

class Employee{
    //instance varibale
    String name; 
    int empId;
    double salary;
    String department;

    //default constructor
    public Employee() {
    }

    // parameterilized constructor
    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.empId = id;
        this.salary = salary;
        this.department = department;
    }

    // here this method will print employee details
   public void printDetails(){
        System.out.println("Employee : name : "+this.name+" id : "+this.empId+" salary : "
        +this.salary+" department : "+this.department);
    }
}