package String_class;
// String Class Methods/Functions - equalsIgnoreCase()
public class StringClassMethodsEquals 
{
public static void main(String[] args)
{
	String s1 = "HAPPY";
	
	
	String s2 = "Happy";
	System.out.println(s2.equalsIgnoreCase(s1)); //true
	
	
	String s3 = "Happy";
	System.out.println(s2.equalsIgnoreCase(s3)); //true
	
	String s4 ="happy";
	System.out.println(s4.equalsIgnoreCase(s3)); // true

	

	String s5 = "Happy boy";
	
	String s6 ="happy Boy";
	System.out.println(s6.equalsIgnoreCase(s5)); // true
}

}
