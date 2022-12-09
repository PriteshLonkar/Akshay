package Exception;

public class sample3 
{
  public static void main(String[] args)
  {
	  
	  String s1= "velocity";
	  
	  try 
	  {
		  System.out.println(s1.charAt(9));  
	  }
	  
	  catch (StringIndexOutOfBoundsException a)
	  {
		  System.out.println("StringIndexOutOfBoundsException handled");
	  }
	  
	  
	  System.out.println("I love India");
	  
	  
	
}
}
