package CheckForAnagrams;

import java.util.HashMap;
import java.util.Scanner;

//CHECK IF TWO STRINGS ARE ANAGRAMS OF EACH OTHER

public class CheckForAnagrams {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] strings = scan.nextLine().split(" ");
		String str1 = strings[0];
		String str2 = strings[1];
		
		HashMap<Character,Integer> str1SET = new HashMap<Character,Integer>();
		HashMap<Character,Integer> str2SET = new HashMap<Character,Integer>();
		
		if(str1.length() != str2.length()) { System.out.print("NO"); return;}
		
		for(int i = 0 ; i < str1.length();i++)
		{
			char c = str1.charAt(i);
			if(!str1SET.containsKey(c)) str1SET.put(c, 1);
			else str1SET.put(c, str1SET.get(c)+1);
			
			char z = str2.charAt(i);
			if(!str1SET.containsKey(z)) str1SET.put(z, 1);
			else str1SET.put(z, str1SET.get(z)+1);
		}
		
		if(str1SET.equals(str2SET)){ System.out.print("YES"); return;}
		
		System.out.print("YES");

	}

}
