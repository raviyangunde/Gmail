package vtigerPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemovDuplicateString {

	public static void main(String[] args) {
		
		 String s = "testyantra";
			
			//Step:1 Create a set collection & add all characters of the given string
					LinkedHashSet<Character> set = new LinkedHashSet<Character>();
					for (int i = 0; i < s.length(); i++) {
			        set.add(s.charAt(i));

					}
			        for (Character ch : set) {
						System.out.print(ch);
					}
	}

}
