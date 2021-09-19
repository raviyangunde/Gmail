package vtigerPractice;

public class PrintVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "indIA";
//		String s=str.toLowerCase();
		String s = str.toUpperCase();
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				System.out.print(s.charAt(i));
			}
		}

	}

}
