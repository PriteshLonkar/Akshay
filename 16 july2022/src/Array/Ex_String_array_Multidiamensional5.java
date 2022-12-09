package Array;
//Print all info of String array 
public class Ex_String_array_Multidiamensional5
{

	
	public static void main(String[] args) 
	{
		// int array declaration
		String [][] ar = new String [2][3];
		
		
		 // int array initialization
		ar[0][0]= "Ram";
		ar[0][1]= "Shyam";
		ar[0][2]= "Neha";
		ar[1][0]= "Niraj";
		ar[1][1]= "Ganesh";
		ar[1][2]= "Appa";
		
		// int array usage
		System.out.println(ar[0][1]);  //Shyam
		
		
		System.out.println("------Print all info in array--------------");
		
		for(int i=0; i<=1; i++)   // row size
		{
			for (int j=0; j<=2; j++)
			{
			System.out.print(ar[i][j]+ " ");  // column size
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
