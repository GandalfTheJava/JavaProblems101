package JoinStringWithDelimiter;

import java.util.Scanner;

public class JoinStringsWithDelimiter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" "); //input of various strings, spaces in between
		String delimiter = scan.next();
		
		testCode(input,delimiter);

	}
	
	private static void testCode(String[] input, String delimiter)
	{
		StringBuilder str = new StringBuilder();
		int last = input.length-1;
		for(int i = 0 ; i < input.length;i++)
		{
			if(i != last) str.append(input[i] + delimiter);
			else str.append(input[i]);
		}
		System.out.println(str);
	}

}
