package vtigerPractice;

public class RevString2 {

	public static void main(String[] args) {
		// WITHOUT USING LENGTH() 
		
		String s = "india";
		char[] ch = s.toCharArray();
		int count = 0;
		for(char c: ch) {
			count++;
		}
		for (int i = count-1; i>=0; i--) {
		System.out.print(s.charAt(i));
		}
	}

}
