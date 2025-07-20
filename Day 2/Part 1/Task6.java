// 6. Define a method to convert the decimal number to a binary number?

public class Task6 {
    static StringBuilder binary=new StringBuilder();
    public static void main(String[] args) {
        decimalToBinary(10);
        System.out.println(binary.reverse());
    }

    // here the method will convert decimal to binary recursively 
    public static void decimalToBinary(int n){
        if(n==0) return;
        int bit=1;
        binary.append(n & bit);
        decimalToBinary(n >> 1);
    }
}
