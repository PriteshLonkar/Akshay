package Method;
// nonstatic regular method call from same class without parameter
public class Method4 
{
public static void main(String[] args) 
{

Method4 s1= new Method4();    // create new object of same class

s1.m3();                      // objectname.method name


}

public void m3()
{
	System.out.println("nonstatic regular method from same clas  m3");
}

}
