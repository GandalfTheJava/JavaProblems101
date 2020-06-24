import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicateCharsInString {

	/*
	 * 
	 * “Write a program that counts duplicate characters from a given string.”
	 * Excerpt From: Anghel Leonard. “Java Coding Problems”.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next(); //This is the input
		scan.close();
		
		
		Map<Character,Integer> duplicateCount = new HashMap<Character,Integer>();
		
		for(int i = 0 ; i < input.length();i++) //iterate the string
		{
			char c = input.charAt(i);
			
			if(duplicateCount.containsKey(c)) duplicateCount.put(c, duplicateCount.get(c)+1);
			else duplicateCount.put(c,1);
		}
		
		System.out.println(duplicateCount.toString());
	}

}
