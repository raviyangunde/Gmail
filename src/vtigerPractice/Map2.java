package vtigerPractice;

import java.util.TreeMap;

public class Map2 {
   public static void main(String[] args) {
	   
	   TreeMap map = new TreeMap();
	   
	   map.put(10, 10);
	     map.put(30, 20);
	     map.put(15, 15);
	     map.put(40, 40);
	     map.put(45, 20);
	     map.put(01, null);
	  //   map.put(null,20);
	//     map.put("fruit", "mango");//classcast exception
	     map.put(45, "mango");
	     System.out.println(map);
}
}
