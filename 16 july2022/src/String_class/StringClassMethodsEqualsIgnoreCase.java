package String_class;
// String Class Methods/Functions - equals()
public class StringClassMethodsEqualsIgnoreCase 
{
public static void main(String[] args)
{
	String s1 = "HAPPY";
	
	
	String s2 = "Happy";
	System.out.println(s2.equals(s1)); //false
	
	
	String s3 = "Happy";
	System.out.println(s2.equals(s3)); //true
	
	String s4 ="happy";
	System.out.println(s4.equals(s3)); // false

}
}
