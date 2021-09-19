package vtigerPractice;

import java.util.HashSet;


public class StringOccureneces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "india";
		
		//Step:1 Create a set collection & add all characters of the given string
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		//Step:2 compare each character of set with all the characters of given string	
		}
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
	
         //Step:3 if the given character is matching increment the given variable					
					count++;
				}
			}
		//Step:4 Print the char and its respective count
			System.out.println("character  "+ch+"-"+count+"Num of occurence");
				
		}

	}

}
