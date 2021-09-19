package Arrays;

public class PushAllZerosToEnd {

	public static void main(String[] args) {
		int a[]= {1,2,0,0,4,0,5,0,6};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {                        
				a[count++]=a[i];              //here count is incremented
			}
		}
		while(count<a.length) {
			a[count++]=0;
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}

	}

}
