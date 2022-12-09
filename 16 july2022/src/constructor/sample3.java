package constructor;
//user defined constructor with zero parameter
public class sample3 
{
int a;
int b;

sample3()   // user defined constructor
{
	a =15;
	b = 30;
}

public static void main(String[] args) 
{
	sample3 s3=new sample3();
	s3.add();
	
	
}


public void add()
{
	System.out.println(a+b);
}

}
