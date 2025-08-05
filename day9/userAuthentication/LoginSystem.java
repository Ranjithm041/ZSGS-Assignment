package com.day9.userAuthentication;

import java.util.*;

public class LoginSystem {

    public static void main(String[] args) {
    	Map<String,String> map = new HashMap<>();
      Scanner sc = new Scanner(System.in);
      int choice =0;
      do {
    	  System.out.println("-----Login System------");
    	  System.out.println("1. Create User");
    	  System.out.println("2. Login");
    	  System.out.println("0. exit");
    	  System.out.print("Enter the choice : ");
    	  choice = sc.nextInt();
    	  sc.nextLine();
		  System.out.print("Enter the user name : ");
		  String username = sc.nextLine();
		  System.out.print("Enter the password : ");
		  String password = sc.nextLine();
    	  switch(choice) {
	    	  case 1 :{
	    		  try {
	    		  if(map.containsKey(username)) throw new AuthenticationException("User already exist!");
	    		  }catch(AuthenticationException e){
	    			  System.out.println(e);
	    			  break;
	    		  }
	    		  User user = new User(username,password);
	    		  map.put(username, password);
	    		  System.out.println("User created successfully !");
	    		  break;
	    	  }
	    	  case 2:{
	    		  try {
	    		  if(map.containsKey(username) && map.get(username).equals(password)) {
	    			  System.out.println("Login Successfully !");
	    		  }else {
	    			  throw new AuthenticationException("User does not exist!");
	    		  }
	    		  }catch(AuthenticationException e) {
	    			  System.out.println(e);
	    		  }
	    	  }
	    	  case 0:{
	    		  System.out.println("Exiting......");
	    		  System.exit(0);
	    	  }
	    	  default : System.out.println("Invalid Choice !");
    	  }
    	  System.out.println(map);
      }while(choice!=0);
      sc.close();
    }
}
class AuthenticationException extends Exception{
	public AuthenticationException(String message) {
		super(message);
	}
}

