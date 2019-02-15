package palindromes;

import java.util.*;

public class PalindromeFinder {

	public static void main(String[] args) {
		 
		String[] strArray = {"string", "poop", "racecar", "notapalindrome"};
		boolean p;
		
		for(int i = 0; i<strArray.length; i++) {
			StringBuilder backwards = new StringBuilder(strArray[i]);
			
			backwards.reverse();
			
			p = compare(strArray[i], backwards.toString());
			
			if(p) {
				System.out.println(strArray[i] + " is a palindrom");
			}else {
				
				System.out.println(strArray[i] + " is not a palindrome");
			}
			
			
			
			
			
		}
	}
	
	private static boolean compare(String str1, String str2) {
		
		if(str1.equals(str2)) {
			return true;
		}
		else {
			
			return false;
		}
	
	}
}
