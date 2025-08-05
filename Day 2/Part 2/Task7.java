/*
 * 
 * 7. Write a program to input and store the weight of ten people. 
Sort and display them in descending order using the Selection sort technique.
 * 
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] weights =  new float[10]; //declared the weights size of 10

        for(int i=0;i<weights.length;i++){
            System.out.print("Enter the weight "+(i+1)+" : ");
            weights[i]=sc.nextFloat(); // get input from the user
        }

        // selection sort 
        selectionSort(weights);

        //it will print the array
        printArray(weights);
    }

    // sort the array descending order using selection sort
    public static void selectionSort(float[] array){
        for(int i=0;i<array.length-1;i++){
            int maxIndex = i;
            for(int j=i+1; j<array.length;j++){
                if(array[j] > array[maxIndex]){
                    maxIndex=j;
                }
            }

            if(maxIndex !=i){
                float temp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }
    }

    // this method will print the array
    public static void printArray(float[] array){
        System.out.println("The weights are displayed descending order : ");
        for(float n : array){
            System.out.print(n + "   ");
        }
    }
}
