package String_class;
// String Class Methods/Functions - startsWith() & endsWith()
public class StringClassMethodsStartsWithEndsWith 
{
public static void main(String[] args)
{
	String s1 = "Good day";
	System.out.println(s1.startsWith("Good")); //True
	System.out.println(s1.startsWith("g")); //false
	System.out.println(s1.startsWith("G")); //true
	
	
	
	String s2 = "I am fine and right now";

	System.out.println(s2.endsWith("now")); //true
	System.out.println(s2.endsWith("w"));//true
	System.out.println(s2.startsWith("I")); // true
	
	
}

}
