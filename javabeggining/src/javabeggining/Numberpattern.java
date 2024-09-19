package javabeggining;

import java.util.Scanner;

public class Numberpattern {

	public static void main(String[] args) {

		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number do u want to print:");
		int rows = sc.nextInt();
		System.out.println("your pattern is below:  ");
		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
