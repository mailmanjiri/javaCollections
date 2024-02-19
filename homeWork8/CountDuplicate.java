package homeWork8;

public class CountDuplicate {

	public static void main(String[] args) {
		// if a string has a repeating letter find how many time it is repeating
		// in apple p is appearing twice but repeating only once

		countDup("appleapplepl", 'p');
	}
	
	public static void countDup(String str, char c) {
		char[] myArray= str.toCharArray();
		int count=0;
		
		for(char item : myArray) {
			if(item==c) {
				count++;
			}
		}
		System.out.println(count); // it will give 2, which is times of p appearing but we it is repeating only once
       // to find repeating count do as
		System.out.println(count-1);
	}

}
