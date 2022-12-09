package Polymorphism;
// Runtime polymorphism
public class testSample2
{

	public static void main(String[] args) 
	{
	sample01 s1 = new sample01();
	s1.car();
	s1.money();
	s1.mobile();
	
	
	System.out.println("------------------------");
	
	sample02 s2 = new sample02();
	s2.car();
	s2.mobile();
	s2.money();
	s2.laptop();
	}
}

