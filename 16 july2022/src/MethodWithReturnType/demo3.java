package MethodWithReturnType;
// nonstatic method with int return type with String parameters
public class demo3 
{

	public int Studentname(String name1, String name2)
	{
      int a= name1.length();
      int b= name2.length();
      
      int c=a+b;
      
      return c;
	
	}
		
	public static void main(String[] args) 
	{
		demo3 d3= new demo3();
		
		int s1= d3.Studentname("Pritesh","Lonkar");
		System.out.println(s1);
		
		System.out.println(d3.Studentname("Youtube","Live"));
		
		
		int s2= d3.Studentname("Hello", "tunes");
		System.out.println(s2);
		
		System.out.println(d3.Studentname("Instagram","reels"));
		
		
		
		
	}
	}

	
	

