package Array;
//Print all info of int array 
public class Ex_Int_array_singlediamensional
{

	
	public static void main(String[] args) 
	{
		// int array declaration
		int [] ar = new int[4];
		
		 // int array initialization
		ar[0]= 30;
		ar[1]= 20;
		ar[2]= 10;
		ar[3]= 40;
		
		// int array usage
		System.out.println(ar[0]);  //30
		
		System.out.println(ar.length);  //4
		
		System.out.println("------Print all info in array--------------");
		
		for(int i=0; i<= ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
