package RemoveWhiteSpaces;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		testCode(input);

	}
	
	private static void testCode(String input)
	{
		String newStr = "";
		newStr = input.replaceAll(" ","");
		
		System.out.print(newStr);
	}

}
