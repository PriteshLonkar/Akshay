package Polymorphism;
// compiletime polymorphism

public class TestSample1 
{

	public static void main(String[] args)
	{
		data01 d1 =new data01();
		d1.Add(10, 20);    //binding of 2 parameter addition method
		d1.Add(2, 5, 6);   //binding of 2 parameter addition method
	}
}
