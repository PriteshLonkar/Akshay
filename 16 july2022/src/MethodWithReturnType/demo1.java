package MethodWithReturnType;
//nonstatic method with int return type with String parameters
public class demo1 
{

	public int Studentname(String name)
	{
		int a = name.length();
	
		return a;
	
	}
		
	public static void main(String[] args) 
	{
		demo1 d1= new demo1();
		
		int s1= d1.Studentname("Pritesh");
		System.out.println(s1);
		
		System.out.println(d1.Studentname("Youtube"));
		
		
		int s2= d1.Studentname("Hello");
		System.out.println(s2);
		
		System.out.println(d1.Studentname("Instagram"));
		
		
		
		
	}
	}

	
	

