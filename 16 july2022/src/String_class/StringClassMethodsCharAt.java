package String_class;
// String Class Methods/Functions - contains()
public class StringClassMethodsCharAt 
{
public static void main(String[] args)
{
	String s1 = "Good day";
	System.out.println(s1.contains("day")); //true
	
	String s2 = "I am fine";
	System.out.println(s2.contains("day")); //false
	System.out.println(s2.contains("am")); //true
	System.out.println(s2.contains("I am"));// true
	
	
	String s3 ="happy Boy";
	System.out.println(s3.contains("happy boy"));// false
	System.out.println(s3.contains("Boy"));//true
	
}

}
