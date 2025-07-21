
/*
4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b)
ZOHO
CORP
ORAT
IONS
‌
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for pascal triangle : ");
        int rows = sc.nextInt(); // get inout from the user

        pascalPattern(rows); // this method call will print the pascal pattern


        System.out.println("Enter the number of columns for zoho pattern : ");
        int columns = sc.nextInt(); // get input from the user

        zohoPattern(columns); // this method call will print the zohocorporations pattern
    }
    
    //this method will implement the pascal triangle
    static void pascalPattern(int row){
        List<List<Integer>> list = new ArrayList<>();
        int i=0;
        do{
            List<Integer> temp = new ArrayList<>();
            int col=0;
            do{
                if(col==0 || col==i){
                    temp.add(1);
                }else{
                   int sum = list.get(i-1).get(col-1)+list.get(i-1).get(col);
                   temp.add(sum);
                }
                
            }while(col++<i);
            list.add(temp);
        }while(i++<row-1);
        
        // print the pascal triangle pattern
        for(int k=0;k<list.size();k++){
            for (int l = 0; l < list.size() - k - 1; l++) {
                System.out.print("  "); 
            }
            for(int j=0;j<list.get(k).size();j++){
                System.out.print(list.get(k).get(j)+"  ");
            }
            System.out.println();
        }
    }

    // this method will prit the zoho pattern
    static void zohoPattern(int columns){
        String word = "ZOHOCORPORATIONS";
        int i=0, len = word.length();
        do{  
            int j=0;
            do { 
                if(i>=len) break;
                System.out.print(word.charAt(i));
                i++;
            } while (j++<columns-1);
            
            System.out.println();
        }while(i<len);
    }
}
