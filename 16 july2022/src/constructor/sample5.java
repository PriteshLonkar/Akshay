package constructor;

public class sample5

{
	//constructor overloading
	
	int num1;
	int num2;
	String name;    //rahul
	
	//constructor without parameter
	sample5()
	{
		num1=50;
		num2=60;
	}
	
	//constructor with 2 int parameter
	sample5(int a, int b)
	{
		num1=a;
		num2=b;		
	}
	
	//constructor
	sample5(String s1)  //s1= rahul
	{
		name=s1;   //rahul
	}
	
	
	public void add() 
	{
		System.out.println(num1+num2);
	}
	
	public void StudentName()
	{
		System.out.println(name);
	}
	
		
	public static void main(String[] args) 
	{
		sample5 s5=new sample5();
		s5.add();                //110
		
		System.out.println("------");
		
		sample5 s6=new sample5(9, 7);
		s6.add();
		
		System.out.println("-----");
		
		sample5 s7=new sample5("rahul");
		s7.StudentName();
	}
}
