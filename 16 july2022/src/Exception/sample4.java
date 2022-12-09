package Exception;

public class sample4 
{
public static void main(String[] args) 
{
	int a= 10;
	int b=0;
	
	try {
		int c= a/b;
		
		System.out.println(c);
	}
	
	catch (Exception e) 
	{
		e.printStackTrace();
		System.out.println("Exception handled");
	}
	
	System.out.println("My name is Om");
}
}
