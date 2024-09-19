package javabeggining;

import java.util.Scanner;

public class AgeTicketProgram {


		   public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String choice, music;
			choice = scanner.next();
			System.out.println("would you like to watch comedy ?");
			if (choice.equalsIgnoreCase("yes")){
				System.out.println("bramhi/Ali/Sunil");
				
			}
			else if (choice.equalsIgnoreCase("No")) {
				System.out.println("would you like to watch music");
				music =scanner.next();
				if (music.equalsIgnoreCase(music)){
					System.out.println("manisharma/DSP/thaman");
					
				}
				else 
				{
					System.out.println("kanchana/Veerupaksha");
				}
				
			}
					
		}

	}