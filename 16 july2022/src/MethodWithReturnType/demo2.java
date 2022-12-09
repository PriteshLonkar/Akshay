package MethodWithReturnType;
// static method with int return type with int parameters
public class demo2 
{

	public static int Add(int a, int b)
	{
		int sum= a+b;
		return sum;
		
	}
	
	public static void main(String[] args) 
	{
		int s1 = Add(10,20);
		System.out.println(s1);
		
	System.out.println(Add(15,5));
		
		int s2= Add(5,2);
		System.out.println(s2);
		
		System.out.println(Add(50,25));
		
	}

	
	
}
