package Abstract;   // check class A

public interface Inf1 {
	
	public void b1();  // this is a abstract method
	
	public abstract void b4();  
	
	public static void b2() {               // this is out of question of abstract or non abstract
		System.out.println(" i am b2 a static and non-Abstract method");
	}
   
	
	public default void b3() {System.out.println("I am from default b3");} // this is default and you can change it
	
	
	
}
