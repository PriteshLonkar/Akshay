package control_if_else;
//control statement - else if
public class data02 
{
public static void main(String[] args) 
{

	int num= 30;
	
	if (num >=65)
	{
		System.out.println("Pass with distinction");
	}
	else if (num >=60 & num<65)
	{
		System.out.println("Pass with first class");
	}
	else if (num >=35 & num <60)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
}






}
