package RemoveDuplicateCharsFromString;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateCharsFromString {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		testCode(str);
	}
	
	private static void testCode(String input)
	{
		HashSet<Character> str = new HashSet<Character>();
		for(int i = 0 ; i < input.length();i++)
		{
			str.add(input.charAt(i)); //Add the char
		}
		
		System.out.println("INPUT: " + input + " RESULT: " + str.toString().replaceAll("[^\\w]",""));
	}
	

}
