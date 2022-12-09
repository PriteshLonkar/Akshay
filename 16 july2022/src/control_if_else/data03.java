package control_if_else;
//control statement -Nested if
public class data03 
{
public static void main(String[] args)
{
int PEM = 200;

if (PEM >=200) 
{
	System.out.println("eligible for mains exam");
	int FEM = 299;
	
	if (FEM > 300 )
	{ 
		System.out.println("selected for interview");
	}
	
	else 
	{
		System.out.println("not selected for interview");
	}
}

	else 
	{
		System.out.println("Not eligible for mains exam");
	}
}
}
