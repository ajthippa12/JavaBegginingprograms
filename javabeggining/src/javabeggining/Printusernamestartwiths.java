package javabeggining;

import java.util.Scanner;
//write a program to take the name
//of the user name start with S ?
public class Printusernamestartwiths {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your name:");
		String name  =sc.nextLine();
		if(name.startsWith("S")||(name.startsWith("s"))) {
			System.out.println("your name starts with 'S' :");
			
		}
		else {
			System.out.println("your name does not start with 'S':");
		}


	}

}
