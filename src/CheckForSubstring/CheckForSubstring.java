package CheckForSubstring;

import java.util.Scanner;

public class CheckForSubstring {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		String subStr = scan.next();
		
		if(str.contains(subStr)) System.out.println("YES");
		else System.out.println("NO");
		
	}

}
