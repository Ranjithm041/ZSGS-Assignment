package com.day4.mulipleinheritance;

public class Family {
    public static void main(String[] args) {
        Father f = new Father();
        Mother m = new Mother();
      //  Son s = new Son(); 
    }
}

class Father {
    Father() {
        System.out.println("Father class");
    }
}

class Mother {
    Mother() {
        System.out.println("Mother class");
    }
}

//multiple inheritance not allowed using classes
/*
class Son extends Father, Mother {
    Son() {
        System.out.println("Son class");
    }
}

 */

