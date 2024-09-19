package javabeggining;

import java.util.Scanner;

public class Convertrupeeprogram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter rupee :");
		float indianrupee = sc.nextFloat();
		float conversionrate= 0.12f;
        float pound= indianrupee*conversionrate;
		 System.out.println("convert into pound:" +pound);
		
	}


}
