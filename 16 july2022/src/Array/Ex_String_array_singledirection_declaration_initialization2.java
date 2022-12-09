package Array;

import java.util.Arrays;

public class Ex_String_array_singledirection_declaration_initialization2
{
public static void main(String[] args)
{
	// declaration and initialization in single step
	String [] ar1 = {"AB", "CD", "EF", "GH"};
	
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
