// 10. Write a program to check whether the object is an instance of a particular class?

public class Task10 {
    public static void main(String[] args) {

        Person person = new Person("Ranjith"); // initialize the object

        boolean isObjectInstance= person instanceof Person; // check if the person object is instace of Person class

        System.out.println(isObjectInstance? " Yes " : "No");
    }
}

// here i created the Person class
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}