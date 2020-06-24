package FirstNonRepeatedChar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		scan.close();
		
		
		testCode(input);

	}
	
	private static void testCode(String input)
	{
		Map<Character,Integer> values = new HashMap<Character,Integer>();
		for(int i = 0 ; i < input.length();i++)
		{
			char c = input.charAt(i);
			if(values.containsKey(c)) 
			{
				values.put(c, values.get(c)+1);
			} else {
				values.put(c, 1);
			}
		}
		char result = 0;
		for (Map.Entry<Character, Integer> entry : values.entrySet()) {
		    Character key = entry.getKey();
		    Integer value = entry.getValue();
		    
		    if(value == 1) //First non repeating
		    {
		    	result = key;
		    	break;
		    }
		}
		System.out.println("INPUT: " + input + " \nRESULT: " + result);
	}

}
