package Array;

import java.util.Arrays;

public class Ex_int_array_singledirection_declaration_initialization
{
public static void main(String[] args)
{
	// declaration and initialization in single step
	int [] ar1 = {10,50,30,40};
	
	// array usage
	
	System.out.println(ar1[0]);
	
	System.out.println("----------------------");
	
	for(int i=0; i<=ar1.length-1; i++)
	{
		System.out.println(ar1[i]);
	}
	
	
	System.out.println("Print sorted data in array");
	
	Arrays.sort(ar1);
	
	for(int i=0; i<=ar1.length-1; i++)
	{
		System.out.println(ar1[i]);
	}
	
}
}
