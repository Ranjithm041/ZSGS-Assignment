// 5. Write a program that illustrate the execution order of static block and initializer block?

public class Block {
    static{
        System.out.println("Static block executed ! ");
    }
    {
        System.out.println("Instance block executed !");
    }
    public static void main(String[] args) {
        System.out.println("Main method started");
        Block b=new Block();
    }
}
