package Method;
// non static regular method call from same class with parameter
public class Method10 
{
public static void main(String[] args) 
{
Method10 s8= new Method10();    // create  new object of same class
s8.sub(5,2);                  // objectname.method name

}

public void sub(int num1, int num2)
{
	System.out.println("Substraction:"+ (num1-num2));
}
}
