package Arrays;

public class AddOfGivenTwoArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int b[]= {4,5,1,2,3};
		int count = a.length;
		if(count<b.length) {
			count = b.length;
		}
		for (int i = 0; i < count; i++) {
			try {
					System.out.println(a[i]+b[i]);
				}
				catch(Exception e){
					if(a.length>b.length) {
						System.out.print(a[i]);
					}else {
						System.out.print(b[i]);
					}
				}	
			
		}

	}

}
