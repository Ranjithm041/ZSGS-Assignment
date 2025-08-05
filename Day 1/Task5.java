// 5. Write a program that illustrate the execution order of static block and initializer block?

public class Task5 {
    //static block
    static{
        System.out.println("Static block executed ! ");
    }
    //instance block
    {
        System.out.println("Instance block executed !");
    }
    public static void main(String[] args) {
        System.out.println("Main method started"); // main method start 
        Task5 b=new Task5(); // object invoke
    }
}
