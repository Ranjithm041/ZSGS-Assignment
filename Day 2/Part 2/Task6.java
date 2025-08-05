/*
 *
 *  6. Write a program to accept the year of graduation from school as an integer value from the users . 
Using the Binary search technique on the sorted array of integers given below . 
Output the message “record exists" if the value input is located in the array and 
if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
 * 
 * 
 */

import java.util.Scanner;
import java.util.Arrays;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students : ");
        int studentCount = sc.nextInt();
        int[] graduationYear = new int[studentCount];
        for(int i=0;i<graduationYear.length;i++){
            System.out.print("Enter the student "+(i+1)+"graduation year :");
            graduationYear[i]=sc.nextInt();
        }

        //sort the graduation array using count sort O(n+m) tc
        countSort(graduationYear);
        System.out.println(Arrays.toString(graduationYear));

        System.out.println("Enter the target : ");
        int target = sc.nextInt();

        //Binary search
        binarySearch(graduationYear,target);

    }
    public static void binarySearch(int[] array,int target){
        int left=0,right=array.length-1;
        boolean isExists=false;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(array[mid]==target){
                isExists=true;
                break;
            }else if(array[mid]>target) right=mid-1;
            else left=mid+1;
        }
        if(isExists) System.out.println("Record Exists !");
        else System.out.println("Record Does not Exists !");
    }
     public static void countSort(int[] nums){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]) max=nums[i];
            if(min>nums[i]) min= nums[i];
        }
        int range = max+min+1;
        int[] array = new int[range];
        for(int i=0;i<nums.length;i++){
            array[nums[i]-min]++;
        }
        int idx=0;
        for(int i=0;i<array.length;i++){
            while(array[i]-->0){
                nums[idx++]=i+min;
            }
        }
    }
}
