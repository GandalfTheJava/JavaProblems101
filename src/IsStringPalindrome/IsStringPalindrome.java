package IsStringPalindrome;

import java.util.Scanner;

//words for single words only!!!
//e.g : level, noon, kayak
public class IsStringPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		word.toLowerCase();//Convert for uniformity
		testCode(word);

	}
	
	private static void testCode(String word) {
		String[] str = word.split("");
		boolean result = false;
		
		for(int i = 0; i < str.length/2;i++) //Halfway
		{
			if(str[i].compareTo(str[str.length-1-i]) == 0) result = true;
			else result = false;
		}
		System.out.println(result);
	}

}
