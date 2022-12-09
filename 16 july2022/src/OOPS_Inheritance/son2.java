package OOPS_Inheritance;
//sub class2
//hirarchicle inheritance
public class son2 extends father
{
	public static void main(String[] args) 
	{
		son2 s1= new son2();
		s1.mobile();
		s1.Car();
		s1.Home();
		s1.Money();
	}
	
	
public void mobile() 
{
	System.out.println("son2- mobile");

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
