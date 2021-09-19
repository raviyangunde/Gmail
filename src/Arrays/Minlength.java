package Arrays;

import java.util.Iterator;

public class Minlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s[] = {"bye", "who", "hi", "to", "amma"};
         String min = s[0];
         
         for (int i = 1; i < s.length; i++) {
			if(min.length()>s[i].length()) {
				
				min = s[i];
			}
		}
         for (int j = 0; j < s.length; j++) {
				if(min.length()==s[j].length()) {
					System.out.println(s[j]);
				}
         }
	}

}
