package javabeggining;

import java.util.Scanner;

public class Temperaturecalculation
{
	public static void main(String[]args)
	{
	
	Scanner scanner = new Scanner (System.in);
	int celsiusstart,celsiusend;
	System.out.print("enter starting value of celsius :");
	celsiusstart=scanner.nextInt();
	System.out.print("enter ending value of celsisus  :");
	celsiusend=scanner.nextInt();
	System.out.println("celsius      Faharenheit");
	
	for(int i=celsiusstart;i<=celsiusend+1;i++)
	{
		System.out.print(i+"             ");
		
		float Faharenheit = i*9/5+32;
		System.out.println(Faharenheit);
		
	}
	}
}
