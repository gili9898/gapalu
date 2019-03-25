package com.happu;

public class PalindromeTest {

	
	public static void main(String[] args) {
		
		String s ="ctc";
		
		if(checkPalindrome(s)) {
			System.out.println("Given String is palidrome..");
		}
		else {
			System.out.println("Given Strig is not palindrome..");
		}
		
		
		
	}

	private static boolean checkPalindrome(String s) {
		boolean check = true;
		int start = 0;
		int end = s.length()-1;
		
		while(start < end) {
			
			if(s.charAt(start) != s.charAt(end)) {
				check = false;
			}
			start++;
			end--;
			
		}
		
		return check;
	}
}
