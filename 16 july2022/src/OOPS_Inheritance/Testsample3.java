package OOPS_Inheritance;
// hirarchicle inheritance (multiple sub class access to one superclass father)
public class Testsample3
{

	public static void main(String[] args) 
	{
		
		son1 s1= new son1();
		s1.paper();
		s1.Car();
		s1.Home();
		s1.Money();
		
		
		System.out.println("-------------------");
		
		son2 s2 = new son2();
		s2.mobile();
		s2.Car();
		s2.Home();
		s2.Money();
		
		
		
		
	}
}
