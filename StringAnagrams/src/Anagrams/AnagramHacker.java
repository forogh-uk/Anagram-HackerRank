package Anagrams;

import java.util.Scanner;

public class AnagramHacker {
	
	public static boolean isAnagram(String a, String b) {
		int a_length = a.length();
		int b_length = b.length();
		if(a_length != b_length)
			return false;
		
		a = a.toLowerCase();
		b=b.toLowerCase();
		
		
		//alphabet 26 it is better than to use hash map
		int[] freq = new int[26];
		
		for(int i = 0; i < a.length(); i++) {
			char currentChar = a.charAt(i);
			int index= currentChar -'a';
			System.out.println("index: " + index);
			freq[index]++;
			
		}
		
		for(int i = 0; i< b.length(); i++) {
			char currentChar = b.charAt(i);
			int index = currentChar -'a';
			freq[index]--;
		}
		for(int i = 0; i<26 ;i++) {
			if(freq[i] != 0 )
				return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a,b);
	
		System.out.println(ret ? "Anagram" : "Not Anagram");
		

	}

}
