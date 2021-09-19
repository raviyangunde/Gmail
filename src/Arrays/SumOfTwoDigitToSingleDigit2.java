package Arrays;

public class SumOfTwoDigitToSingleDigit2 {

	public static void main(String[] args) {
		int n = 456945;
		while(n>9) {
			int sum =0;
			while(n>0) {
				int dig = n%10;
				sum = sum+dig;
				n=n/10;
				
			}
			n=sum;
		}
		System.out.println(n);

	}

}
