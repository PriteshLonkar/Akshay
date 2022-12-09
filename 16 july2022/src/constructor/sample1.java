package constructor;
// default constructor
public class sample1 
{
	
	
	// sample1()
	// {
	
	//}

	public static void main(String[] args) {
		
	sample1 s1= new sample1();
	s1.m1();
	
	sample2 s2= new sample2();
	s2.m2();
		
	}
	
	
	
	public void m1()
	{
		System.out.println("nonstatic method");
	}
}
