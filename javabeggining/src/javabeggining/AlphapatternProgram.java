package javabeggining;

public class AlphapatternProgram {

	public static void main(String[] args) {

		int alpha =65;
		System.out.println("print the alphabet:");
		for (int i=0;i<=5;i++) {
			for (int j =0;j<=i;j++) {
				System.out.print((char)(alpha+j)+"");
				
				//alpha++;
				System.out.println();

			}

	}

}
}
