package com.day4.mystring;
/*
 * 
 *6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class.
  Your class should store character data internally (e.g., using a char[] or String as input) and
   should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class.    
 */
public class MyString {

    private char[] strs ; // this is the char array for use of the entire operation
    
    //default constructor
    public MyString(){

    }
    
    // constructor for initialize the char array through the String 
    public MyString(String str){
        this.strs=str.toCharArray();
    }

    // constructor for initialize the cha array through the another char array
    public MyString(char[] strs){
        this.strs=strs;
    }

    // find length of the string
    public int length(){
        return strs.length;
    }

    //it return the char based on given index
    public char charAt(int index){
        try {
          return this.strs[index];
        } catch (Exception e) {
            System.out.println("given index is out of the array ! ");
            throw  e;
        }
    }

    // it check whether the given string is equals of the current string or not
    public boolean equals(MyString other){
        if(other.length()!=this.strs.length) return false;
        for(int i=0;i<other.length();i++){
            if(this.strs[i]!=other.charAt(i)) return false;
        }
        return true;
    }

    // it will convert the String to uppercase
    public MyString toUpperCase(){
        char[] array = new char[this.strs.length];
        for(int i=0;i<this.strs.length;i++){
            if(this.strs[i]>=97 && this.strs[i]<=122){
                array[i] = (char) (this.strs[i]-32);
            }else{
                array[i] = this.strs[i];
            }
        }
        return new MyString(array);
    }

    // it will convert the String to lowercase
    public MyString toLowerCase(){
        char[] array = new char[this.strs.length];
        for(int i=0;i<this.strs.length;i++){
            if(this.strs[i]>=65 && this.strs[i]<=90){
                array[i] = (char) (this.strs[i]+32);
            }else{
                array[i] = this.strs[i];
            }
        }
        return new MyString(array);
    }

    // it will return the substring from start to end
    public MyString substring(int start,int end){
        char[] array = new char[end-start];
        int idx=0;
        for(int i=start;i<end;i++){
            array[idx++]=this.strs[i];
        }
        return new MyString(array);
    }

    // it will return the substring from start to string length
    public MyString substring(int start){
        char[] array = new char[this.strs.length-start];
        int idx=0;
        for(int i=start;i<this.strs.length;i++){
            array[idx++]=this.strs[i];
        }
        return new MyString(array);
    }

    // concat to the current string with other string
    public MyString concat(MyString other){
        char[] array = new char[this.strs.length+other.length()];
        int i=0;
        for(;i<this.strs.length;i++){
            array[i]=this.strs[i];
        }
        for(int j=0;j<other.length();j++){
            array[i++]=other.charAt(j);
        }
        return new MyString(array);
    }

    // it will return true or false when if it is contains the substring present in the current string or not
    public boolean contains(MyString  sub){
        MyString current = new MyString(this.strs);
        int sublen=sub.length();
        for(int i=0;i<this.strs.length-sublen+1;i++){
            if(sub.equals(current.substring(i,i+sublen))){
                return true;
            }
        }
        return false;
    }

    // it just return character index if it is present else return -1
    public int indexOf(char c){
        for(int i=0;i<this.strs.length;i++){
            if(this.strs[i]==c) return i;
        }
        return -1;
    }

    // it will replace the old character to new character
    public MyString replace(char old,char newChar){
        char[] array = new char[this.strs.length];
        for(int i=0;i<this.strs.length;i++){
            if(this.strs[i]==old){
                array[i]=newChar;
            }else {
                array[i]=this.strs[i];
            }
        }
        return new MyString(array);
    }

    // it will convert the object hashcode to String
    @Override
    public String toString(){
        StringBuilder convert = new StringBuilder();
        for(char c : this.strs){
            convert.append(c);
        }
        return convert.toString();
    }
}
