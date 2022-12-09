package this_superkeyword;
// sub class
public class Sample2 extends Sample1
{
 int a=111;           // sub class global variable

public void m1()
{
	int a=4;    // local variable
	
	System.out.println(a);        //4  
	System.out.println(this.a);    //111
	System.out.println(super.a);   //1000

}
}
