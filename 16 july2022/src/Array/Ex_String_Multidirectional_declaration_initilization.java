package Array;

public class Ex_String_Multidirectional_declaration_initilization 
{

public static void main(String[] args)
{   // declaration and initialization
	String [] [] ar1= {{"AB","CD"}, {"EF","GH"}};
	
	
	// usage
	
	for(int i=0; i<=1; i++)
	{
		for(int j=0; j<=1; j++)
		{
			System.out.print(ar1[i][j]+" ");
		}
		System.out.println();
	}
	
}}
	

