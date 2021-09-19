package vtigerPractice;

import java.util.LinkedHashSet;

public class RemoveDuplicateword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to india welcome to bidar";
 		String[] str = s.split(" "); 
 		LinkedHashSet<String> set = new LinkedHashSet<String>();
 		for (int i = 0; i <str.length; i++) {
 			set.add(str[i]);
 		}
 		for (String word : set) {
			System.out.print(word+" ");
		}
	}

}
