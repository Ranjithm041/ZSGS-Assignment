// 3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {
        int n=30;
        int[] fib = new int[n]; // here i created the fibonacci array with size of 30 
        fibonacci(n,fib);
        System.out.println(Arrays.toString(fib)); // here i print using Arrays.toString method
        for(int f:fib) System.out.print(f+" ");  // here i print using for each loop
    }

    // this method is find fibonacci values and store into the array
    public static void fibonacci(int n,int[] fib){
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
    }
}
