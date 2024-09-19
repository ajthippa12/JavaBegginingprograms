package javabeggining;

public class LogicaloperatorProgram {

	public static void main(String[] args) {

		int number1 = 12;
		int number2 = 12;
		System.out.println((number1 == 12) && (number2 == 14));
		System.out.println((number1 == 12) || (number2 == 14));
		System.out.println(!(number1 == 12) && (number2 == 14));
		System.out.println(!(number1 == 12) || (number2 == 14));

	}
}
