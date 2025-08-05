package com.day6.userdefinedpackage.stringutils;

public class StringUtils {
	public String concat(String a, String b) {
		return a+b;
	}
	public String reverse(String s) {
		char[] rev = s.toCharArray();
		for(int i=0,j=rev.length-1;i<j;i++,j--) {
			char temp = rev[i];
			rev[i] = rev[j];
			rev[j] = temp;
		}
		return new String(rev);
	}
	public int length(String s) {
		return s.length();
	}
}
