package Arrays;

public class AddOfGivenTwoArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int b[]= {4,5,6};
		int count = a.length;
		if(count<b.length) {
			count = b.length;
		}
		for (int i = 0; i < count; i++) {
			if(a.length==b.length) {
				System.out.println(a[i]+b[i]);
			}
			else if(a.length>b.length) {
				try {
					System.out.println(a[i]+b[i]);
				}
				catch(Exception e){
					System.out.println(a[i]);
				}
			}
		}

	}

}
