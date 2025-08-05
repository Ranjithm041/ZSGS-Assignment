
// 1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?

public class Task1 {
    // static block
    static{
        System.out.println("This is the variouus scope of the varible ");
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ranjith", 104, 40000, "Software Developer");
    }

}

class Employee{
    final static String company="Zoho Corporation"; //final and static variable
    //instance varibale
    String name; 
    int id;
    int salary;
    String department;

    //defaulr constructor
    public Employee() {
    }

    // parameterilized constructor
    public Employee(String name, int id, int salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }
    //instance block
    {
        System.out.println("Employee Object Created Successfully !");
    }
    
    public double getAnnualSalary(double salary){
        double annual = salary*12; // local variable
        return annual;
    }

}
