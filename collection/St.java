package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
// can't add duplicates in Set
public class St {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trees();
		
	}
    
	//hashset
	public static void linkedlis() {
		Set <String> myColl =new HashSet <String>();
		myColl.add("Hello");
		 myColl.add("HI");
		 myColl.add("See you");
		 myColl.add("tomorrow");
		 myColl.add("Hello");   // duplicates remove automatically
		  System.out.println(myColl.size()); //counts only 4
		  myColl.remove("HI");

		 
		 System.out.println(myColl.size());
		 //to retrieve particular value there is no get method as there is no index number, can use loop
		 String targetValue = "Hello";
	        if (myColl.contains(targetValue)) {
	            System.out.println(targetValue + " exists in the set.");
	        } else {
	            System.out.println(targetValue + " does not exist in the set.");
	        }

		 System.out.println(myColl); // print randomly
	}
	
	
	// LinkedHashSet
	
	public static void linkhs() {
		Set <Double> myColl= new LinkedHashSet <Double>();
		myColl.add(10.5);
		myColl.add(34.5);
		myColl.add(50.5);
		myColl.add(70.5);
		myColl.add(60.5);
		  System.out.println(myColl.size()); 
  
		System.out.println(myColl.add(10.5));  // give false as it will duplicate
		myColl.remove(70.5);
		  System.out.println(myColl.size()); //counts only 4
		  System.out.println(myColl); // print in insertion order
		 

	}
	
	//Treeset
	public static void trees() {
		Set <Double> myColl= new TreeSet <Double>();
		myColl.add(50.5);
		myColl.add(34.5);
		myColl.add(10.5);
		myColl.add(70.5);
		myColl.add(60.5);
           
		System.out.println(myColl.add(10.5));  // give false as it will duplicate
		  System.out.println(myColl.size()); //counts only 4
		  System.out.println(myColl); // print in increasing order
		  
		
	}
	
	
	
}
