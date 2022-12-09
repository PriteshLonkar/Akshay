package Exception;
// ArrayIndexOutOfBoundsException handled
public class sample2 
{
	
public static void main(String[] args) 
{
	
	int [] ar = new int[4];
	
	try {
		System.out.println(ar[5]); // exception / risky code
	    }
	
	
	catch(Exception e)
	{
		System.out.println(e.getMessage()); // exception handled
	}
	
	
	
	System.out.println("Hi");
	
}
}
