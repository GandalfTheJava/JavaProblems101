package CountDuplicateCharsInString;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*
 * ““ Write a program that counts duplicate characters from a given string”
 * 	Excerpt From: Anghel Leonard. “Java Coding Problems”. Apple Books. 
 * 
 */
public class CountDuplicateCharsInString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next(); //This is the input
		scan.close();
		
		testCode(input);
	}
	
	private static void testCode(String input)
	{
		
		Map<Character,Integer> duplicateCount = new HashMap<Character,Integer>();
		
		for(int i = 0 ; i < input.length();i++) //iterate the string
		{
			char c = input.charAt(i);
			
			if(duplicateCount.containsKey(c)) duplicateCount.put(c, duplicateCount.get(c)+1);
			else duplicateCount.put(c,1);
		}
		
		System.out.println("INPUT: " + input + " \nRESULT: " + duplicateCount.toString());
	}

}
