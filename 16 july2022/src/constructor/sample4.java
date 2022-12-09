package constructor;
//user defined constructor with parameter
public class sample4
{
int a;
int b;

sample4(int num1, int num2)   // user defined constructor with parameter 
{
	a =num1;
	b =num2;
}

public static void main(String[] args) 
{
   sample4 s4 =new sample4(10,20);    // diff input parameter
	s4.add();
	
	System.out.println("-----------------------------");
	sample4 s5= new sample4(20,22);      // diff input parameter
	s4.add();
	s5.add();
	
}


public void add()
{
	System.out.println(a+b);
}

}