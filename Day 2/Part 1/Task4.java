
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

public class Task4 {
    public static void main(String[] args) {
        pascalPattern(5);
    }
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
        System.out.println(list);
    }
    static void zohoPattern(int row){

    }
}
