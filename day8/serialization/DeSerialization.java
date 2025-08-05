package com.day8.serialization;
import java.io.*;
public class DeSerialization {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("product.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Product p = (Product) ois.readObject();
			ois.close();
			fis.close();
			System.out.println(p);
		}catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
}
