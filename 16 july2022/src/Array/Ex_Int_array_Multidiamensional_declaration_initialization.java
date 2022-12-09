package Array;
//Print all info of int array 
public class Ex_Int_array_Multidiamensional_declaration_initialization
{

	
	public static void main(String[] args) 
	{
		// int array declaration and initialization
		int [][] ar1 = {{20,40},{10,30}} ;
	
		
		// int array usage
		System.out.println(ar1[0][1]);  //30
	
	
		
		System.out.println("------Print all info in array--------------");
		
		for(int i=0; i<=1; i++)   // row size
		{
			for (int j=0; j<=1; j++)
			{
			System.out.print(ar1[i][j]+ " ");  // column size
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
