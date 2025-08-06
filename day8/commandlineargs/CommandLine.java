/*
 4. Get some strings through the command-line prompt and use an array to store and display them.
 */
package com.day8.commandlineargs;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0) {
			System.out.println("There is no arguments entered!");
		}else {
			for(String s : args) {
				System.out.println(s);
			}
		}
	}

}
