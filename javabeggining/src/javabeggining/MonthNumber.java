package javabeggining;

//write a program in java to take the month number from the user:


import java.util.Scanner;

public class MonthNumber

{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.println("enter month number :");
		month=sc.nextInt();
		if (month==1)
		{
			System.out.println("month is january ");
		}
		else if (month==2)
		{
			System.out.println("month is feburary");
		}
		else if (month==3)
		{
			System.out.println("month is march");
		}
		else if (month==4)
		{
			System.out.println("month is April");
		}
		else if (month==5)
		{
			System.out.println("month is may");
		}
		
		else if (month==6)
		{
			System.out.println("month is june");
		}
		else if (month==7)
		{
			System.out.println("month is july");
		}
		else if (month==8)
		{
			System.out.println("month is August");
		}
	
	    else if (month==9)
	{
		System.out.println("month is September");
	}
	    else if (month==10)
		{
			System.out.println("month is oct");
		}
	    else if (month==11)
		{
			System.out.println("month is Nov");
		}
	    else if (month==12)
		{
			System.out.println("month is Dec");
		}
	    else {
	    	System.out.println("Invalid month");
	    }
		}
	
}
		