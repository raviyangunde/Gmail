package Arrays;

public class SecondMax5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20, 56, 40, 60, 72, 35, 10};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int size=a.length-1;
		System.out.println(a[size-1]);
	}

}
