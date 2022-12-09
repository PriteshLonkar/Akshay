package control_if_else;
// nested if
public class sample2 
{

	public static void main(String[] args) 
	{
	
		int PEM= 100;
		if (PEM>=200)
			
		{
			System.out.println("Eligible for mains exam");
			
			int FEM= 250;
			
			if (FEM>=300) 
			{
				System.out.println("Student got selected");
			}
			else
			{
				System.out.println("Student not selected");
			}	
		}
		else 
		{
			System.out.println("Not elegible for mains exam");
		}
	}
}
