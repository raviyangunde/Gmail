package vtigerPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccurenceinEachwrd {

	public static void main(String[] args) {
		
		String s = "welcome to tyss";
		String[] str = s.split(" "); 
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i <str.length; i++) {
			set.add(str[i]);
		}
		for (String word : set) {
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				if(word.equals(str[i])) {
					count++;
				}
			}
			System.out.println(word+" "+count);
		}

	}

}
