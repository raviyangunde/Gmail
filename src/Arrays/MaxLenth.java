package Arrays;

import java.util.Iterator;

public class MaxLenth {
    public static void main(String[] args) {
    	  String s[] = {"hi", "bye", "welcome", "getlost", "sorry"};
    	  String max = s[0];
    	  
    	  
    	  for (int i = 1; i < s.length; i++) {
    		  if(max.length()<s[i].length()) {
    			  max = s[i];
    		  }
		}
    	  System.out.println("Max length is " +max );
//    	  for (int i = 0; i < s.length; i++) {
//    		  if(max.length()==s[i].length()) {
//    			  max=s[i];
//    			  System.out.println(s[i]);
//    		  }
			
		
	}
}
