package CountVowelsANDConsonants;
import java.util.Scanner;

public class CountVowelsANDConsonants {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		//tested with 
		//Haha does this work?
		//Expected: 
			//Vowels: 6
			//Consonants: 9
		testCode(input);

	}
	
	private static void testCode(String input)
	{
		int vowels = 0, consonants = 0, digits = 0, spaces = 0;
		
		for(int i = 0 ; i < input.length();i++)
		{
			char c = input.charAt(i);
			c = Character.toUpperCase(c);
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) vowels++;
			else if( c >= '0' && c <= '9') digits++;
	        else if (c == ' ') spaces++;
	        else consonants++;
		}
		
		System.out.println("INPUT: " + input + " VOWELS: " + vowels + " CONSONANTS: " + consonants);
	}

}
