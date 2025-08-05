/*
 * 
 * 
 * 5. Write a program to initialize the following character arrays and print a suitable message after
checking the arrays whether the two arrays are identical or not.
Make suitable use of Boolean data type. 
X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
 *
 *
 */

public class Task5 {
    public static void main(String[] args) {
        
        char[] X = {'m', 'n', 'o', 'p'};
        char[] Y = {'m', 'n', 'o', 'p'};

        boolean isThere = true; // here i used boolean data type 

        for(int i=0;i<X.length;i++){
            if(X[i]!=Y[i]){
                isThere = false;
                break;
            }
        }

        // print the two arrays are identical or not
        System.out.println(isThere ? "Given Two arrays are Identical " : "Given Two arrays are Not Identical ");
    }
}
