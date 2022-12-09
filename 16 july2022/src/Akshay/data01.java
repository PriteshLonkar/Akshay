package Akshay;
// default constructor-nonstatic regular method call from same class
public class data01
{

	
	// data01()                       -default constructor
	// {
	// }
	
	
	public void m1()
	{
		System.out.println("default constructor-nonstatic regular method call from same class");
	}
	
	
	public static void main(String[] args) 
	{
		data01 s1 =new data01();   // create object of same class
		s1.m1();                   // objectname.method name----
		
		
		//data01 ----- classname-----datatype of object
		// s1 ---- objectname- to identify object
		// new ----keyword-----create new object
		// data01();------constructor----- copy all data of class into object
			
	}
	
	
	
	
	
	
	
	
	
}
