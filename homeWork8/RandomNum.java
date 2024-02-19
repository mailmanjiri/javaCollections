package homeWork8;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomNum {

	public static void main(String[] args) {
		// generate 500 random number and give nth smallest number
		// create set as it remove duplicate and use treeSEt as it arrange numbers in ascending order
         Set <Integer> myData= new TreeSet <Integer>();
         
         // save each value from method into set
          while(myData.size()<500) {
        	  myData.add(getRandomNumber());
        	  
        	           }
         
          System.out.println(myData);
    	  System.out.println(myData.size());
          // get smallest number which will be the 1st one in case of TreeSet, we need to convert it to an array
    	  // as array has index number which can be used to retrieve value
    	  
    	 myData.toArray();
    	 // save it in an variable, as it,s data type is object we have to save in it same type variable
    	 
    	 Object[] x=  myData.toArray();

         System.out.println(x[0]);  // it will give first number, which is smallest one
         
         // if you want to retrieve 5th smallest number in the array
         
         int n=5; 
         System.out.println(x[n-1]);
         
         
         
	}
	//method to get a random number
	public static int getRandomNumber() {
		Random random= new Random();      // Random is a class, found code from google
		int randomNumber= random.nextInt(900)+100; // generate random numbers between 100 and 999
		return randomNumber;
	}

}
