package Arrays;

public class MaxSameLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"RAVI", "bye", "who", "hi", "to", "AJAY"};
        String max = s[0];
        
        for (int i = 1; i < s.length; i++) {
			if(max.length()<s[i].length()) {
				
				max = s[i];
			}
		}
        for (int j = 0; j < s.length; j++) {
				if(max.length()==s[j].length()) {
					System.out.println(s[j]);
				}
        }
	}

}
