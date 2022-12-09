package Array;
//Print all info of int array 
public class Ex_Int_array_Multidiamensional5
{

	
	public static void main(String[] args) 
	{
		// int array declaration
		int [][] ar = new int[2][3];
		
		
		 // int array initialization
		ar[0][0]= 30;
		ar[0][1]= 20;
		ar[0][2]= 10;
		ar[1][0]= 40;
		ar[1][1]= 60;
		ar[1][2]= 70;
		
		// int array usage
		System.out.println(ar[0][1]);  //30
		
		System.out.println(ar.length);  //4
		
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
