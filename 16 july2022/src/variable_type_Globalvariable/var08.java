package variable_type_Globalvariable;
//nonstatic global variable from diff class
public class var08
{

	public static void main(String[] args) 
	{
		var07 s7= new var07();
		System.out.println(s7.f);     // className.variableName  // nonstatic global variable from diff class
		
		System.out.println("-------------------------");
		
		var08 s8 =new var08();  
		s8.m1();                           // nonstatic regular method call from same class
		System.out.println("-------------------------");
		
		m2();                              // nonstatic regular method call from same class
	}
	
	public void m1() 
	{
		var07 s9 = new var07();              
		System.out.println(s9.f);      // className.variableName    // nonstatic global variable from diff class
	}	
	
	public static void m2() 
	{
		var07 s10= new var07();
		System.out.println(s10.f);      // className.variableName   // nonstatic global variable from diff class
	}
}
