package variable_type_Globalvariable;
// static global variable call from same class
public class var03 
{
	static int b=10;    // global static variable
public static void main(String[] args)
{
	System.out.println(b);                 // call static global variable in main method from same class
	
	
	
     m1();                               // call static regular method  from same class   
	System.out.println("------------");
	
	var03 x1=new var03();                   // call nonstatic regular method from same class
	x1.m2();
	System.out.println("------------");
	
	
	
	}

public static void m1()
{
	System.out.println(b);        // variableName          // call static global variable in regular method m1

}

public void m2()
{
	System.out.println(b);         // variableName          // call static global variable in regular method m2

}

}

