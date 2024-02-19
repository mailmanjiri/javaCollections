package homeWork8;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateLetters {

	public static void main(String[] args) {
		// Given string find duplicate letters in it
		
		dl();
	}
	
	
	public static void dl() {
		String a="HelloHill";
		char[] x=a.toCharArray();
		
		Set <Character> duplicateChar= new LinkedHashSet <Character>();
		Set <Character> resultSet= new LinkedHashSet <Character>();

		for(char item : x) {
			if(!duplicateChar.add(item)) {           //this if condition gives the value which can't add to the set duplicateChar
				                                     // that means it will gives values which are duplicate
				System.out.println(item);
				// but we don't want all the repeating letters example. PPP, we need a set which only once show the repeating letter
				// so we need to crate another set and add repeating letter to it, so it will show the letters only once
				resultSet.add(item);
				
			}
		}
		System.out.println(resultSet);
		}

}
