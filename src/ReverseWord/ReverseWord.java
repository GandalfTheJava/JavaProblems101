package ReverseWord;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String input = scan.next();

		testCode(input);
	}
	
	private static void testCode(String input)
	{
		StringBuilder result = new StringBuilder();
		int length = input.length();
		while(length != 0) //Starting from the end and going to the start
		{
			result.append(input.charAt(length-1));
			length--;
		}
		System.out.println(result);
	}

}
