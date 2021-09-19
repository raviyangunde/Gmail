package vtigerPractice;

import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TreeSet ts = new TreeSet();
          ts.add(10);
          ts.add(60);  
   //      ts.add("hii"); //classcast exception
   //      ts.add(null); //null pointer exception
          ts.add(50);
          ts.add(30);
        System.out.println(ts.descendingSet());
     //     System.out.println(ts);
	}

}
