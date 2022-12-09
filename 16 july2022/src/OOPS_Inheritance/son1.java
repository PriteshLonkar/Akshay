package OOPS_Inheritance;
//sub class1
//hirarchicle inheritance
public class son1 extends father
{
	public static void main(String[] args) 
	{
		son1 s1= new son1();
		s1.paper();
		s1.Car();
		s1.Home();
		s1.Money();
	}
	
	
public void paper() 
{
	System.out.println("son1- paper");

}

//public void Home() 
//{
//	System.out.println("Home- 1BHK");
//}

//public void Car() 
//{
//	System.out.println("Car- Harrier");
//}

//public void Money() 
//{
//	System.out.println("Money- 5L");
//}
}
