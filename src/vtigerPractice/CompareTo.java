package vtigerPractice;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ravi";
		String s1 ="";
		System.out.println(s.compareTo(s1));//4
		
		String s2="abdf";
		String s3= "bcd";
		System.out.println(s2.compareTo(s3));//-1
	
        String s4="abcd";
        String s5="";
    	System.out.println(s4.compareTo(s5));//4
	}

}
