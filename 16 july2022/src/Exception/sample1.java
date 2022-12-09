package Exception;
// ArrayIndexOutOfBoundsException handled
public class sample1 
{
	
public static void main(String[] args) 
{
	
	int [] ar = new int[4];
	
	try {
		System.out.println(ar[5]); // exception / risky code
	    }
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException handled"); // exception handled
	}
	
	
	System.out.println("Hi");
	
}
}
