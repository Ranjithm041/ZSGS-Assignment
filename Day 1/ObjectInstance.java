// 10. Write a program to check whether the object is an instance of a particular class?

public class ObjectInstance {
    public static void main(String[] args) {
        Person person = new Person("Ranjith");
        boolean isObjectInstance= person instanceof Person;
        System.out.println(isObjectInstance? " Yes " : "No");
    }
}
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}