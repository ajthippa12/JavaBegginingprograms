package javabeggining;

import java.util.Scanner;

//Write a program to take the input as birthyear and 
//calculate the age of the person in 2025?

public class AgeCalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the birth year:");
		int year1 = scanner.nextInt();
		int year2 = 2025;
		int age = year2 - year1;
		System.out.println(age);

	}

}
