package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mp {

	public static void main(String[] args) {
		// map has two things- key and values. key should be unique always. values can be duplicate
		m3();
		
		
		}
	// HashMap- random order
	public static void m1() {
		Map <Character, String> mycol= new HashMap<Character, String>();
		mycol.put('A', "apple");
		mycol.put('B', "hello");
        mycol.put('C', "Hi");
		mycol.put('D', "bye");
		mycol.put('E', "tomorrow");
		
		System.out.println(mycol.size());
		System.out.println(mycol);
		System.out.println(mycol.keySet());  // print keys
		System.out.println(mycol.values());  // print values only
		System.out.println(mycol.put(null, null));  // gives return type of put, it is string but as empty gives null
 
		mycol.remove('A');
		
	}
	
// LinkedHashMap- insertion order
	
	public static void m2() {
		Map <Character, String> mycol= new LinkedHashMap<Character, String>();
		mycol.put('B', "apple");
		mycol.put('A', "hello");
        mycol.put('C', "Hi");
		mycol.put('D', "bye");
		mycol.put('E', "tomorrow");
		
		System.out.println(mycol.size());
		System.out.println(mycol);
		
	}
	
	// TreeMap- alphabetical order of values
	public static void m3() {
		Map <Character, String> mycol= new TreeMap<Character, String>();
		mycol.put('C', "apple");
		mycol.put('B', "hello");
        mycol.put('A', "Hi");
		mycol.put('B', "bye"); // as duplicate will take the last value
		mycol.put('E', "tomorrow");
		
		System.out.println(mycol.size());
		System.out.println(mycol.values()); // it will print all values in a line
		
		//to print values one after another need to use while loop
		
		for(String item : mycol.values()) {
			System.out.println(item);
		}
		
	}

}
