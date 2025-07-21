// 2. Write a program in which, declare all data types like integer, double, float, long integer,
// character and byte data and print them.

public class Task2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Ranjith", 104, 'M',(byte) 22, 40000, (float) 3.4,1234567890);
        employee.printDetails(); // this method will print the employee details
    }
}
class Employee{
    // here i have mentioned all given data types.
    String name;
    int id;
    char gender;
    byte age;
    double salary;
    float experience;
    long mobileNumber;
    public Employee() {
    }
    
    public Employee(String name, int id, char gender, byte age, double salary, float experience, long mobileNumber) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
        this.mobileNumber=mobileNumber;
    }
    public void printDetails(){
        System.out.println("Employee : name : "+this.name+" id : "+this.id+" gender : "+
        this.gender+" salary : "+this.salary+"experience : "+this.experience+" mobile : "+this.mobileNumber);
    }
}