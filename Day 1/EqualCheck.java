// 4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?

public class EqualCheck {
    public static void main(String[] args) {
        int person1_rank =1;
        int person2_rank =1;
        
        int equal=person1_rank ^ person2_rank;

        switch(equal){
            case 0:{
                System.out.println("Equal");
                break;
            }
            default: System.out.println("Not Equal"); 
        }
    }
}
