package Array;
//Print all info of String array 
public class Ex_String_array_singlediamensional
{

	
	public static void main(String[] args) 
	{
		// String array declaration
		String [] ar = new String[4];
		
		 // String array initialization
		ar[0]= "Suresh";
		ar[1]= "Ramesh";
		ar[2]= "Ganesh";
		ar[3]= "Pritesh";
		
		// String array usage
		System.out.println(ar[0]);  //Suresh
		
		System.out.println(ar.length);  //4
		
		System.out.println("------Print all info in array--------------");
		
		for (int i=0; i<=ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		
		
		
	}
}
