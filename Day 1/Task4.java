// 4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?

public class Task4 {
    public static void main(String[] args) {
        int person1_rank =1;
        int person2_rank =1;
        
        int equal=person1_rank ^ person2_rank; // XOR for check if the rank is same or not

        // here i used switch case for  w/o using comparison operator
        switch(equal){
            case 0:{
                System.out.println("Equal");
                break;
            }
            default: System.out.println("Not Equal"); 
        }
    }
}
