package vtigerPractice;

public class SortElementsAlphanumeric {

	public static void main(String[] args) {
		
		String str[] = {"apple", "mango", "banana", "orange"};
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if ((str[i].compareTo(str[j])>0)) {
					String temp = str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]);
		}

	}

}

//output
 //apple
//banana
//mango
//orange
