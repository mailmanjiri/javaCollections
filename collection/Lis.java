package collection;
  // two types of list- Arraylist and LinkedArrayList
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lis {

	public static void main(String[] args) {
		// list 
	//	CollectionName<ObjectDataType> ObjectName =new CollectionTypeOfSameName <ObjectDataType>(); 
        linkedlis();
			}
	
	
	// Arraylist
	public static void arrlis() {
		 List<Integer> myColl = new ArrayList <Integer>(); 
		 myColl.add(400);
		 myColl.add(500);
		 myColl.add(600);
		 myColl.add(100);
		 myColl.add(150);

		  System.out.println(myColl.size());
		 myColl.remove(1);  // give index number to remove that value
		 System.out.println(myColl.get(3));  // retrieve value
		 System.out.println(myColl);

	}
	
	
	// LinkedList
	public static void linkedlis() {
		List<String> myColl = new LinkedList <String>();
		myColl.add("Hello");
		 myColl.add("HI");
		 myColl.add("See you");
		 myColl.add("tomorrow");
		 myColl.add("bye");
		 myColl.add("12");
		  System.out.println(myColl.size());
		  
		 myColl.remove(1);  // give index number to remove that value
		 System.out.println(myColl.size());
		  
		 System.out.println(myColl.get(3));  // retrieve value
		 System.out.println(myColl);
	}
}
