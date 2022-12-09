package variable_type_Globalvariable;
// non static global variable call from same class
public class var06 
{
	int a=10;    //  nonstatic global variable
public static void main(String[] args)
{
	
	var06 s6=new var06();
	
	System.out.println(s6.a);           // className.variableName  // call nonstatic global variable in main method from same class
	
	System.out.println("------------");
	
     m1();                               // call static regular method  from same class   
	System.out.println("------------");
	
     s6.m2();                             // call nonsstatic regular method  from same class 
     
     
	}

public static void m1()
{
	var06 s7=new var06();
	System.out.println(s7.a);       // className.variableName               // call nonstatic global variable in regular method m1

}

public void m2()
{
	System.out.println(a);                   // call nonstatic global variable in regular method m2

}

}

