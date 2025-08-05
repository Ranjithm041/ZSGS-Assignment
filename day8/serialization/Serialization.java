package com.day8.serialization;
import java.io.*;
public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(101,"pen",4,50.5);
		
		
		
		try {
			FileOutputStream fos = new FileOutputStream("product.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
			oos.close();
			fos.close();
			System.out.print("Serialized");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
