package String_class;
// String Class Methods/Functions - indexOf() & lastIndexOf()
public class StringClassMethodsIndexOf 
{
public static void main(String[] args)
{
	String s1 = "Good day";
	System.out.println(s1.indexOf("o")); //1
	System.out.println(s1.lastIndexOf("o")); //2
	
	String s2 = "I am fine and right now";
	System.out.println(s2.lastIndexOf("a")); //10
	System.out.println(s2.lastIndexOf('a')); //10
	System.out.println(s2.indexOf("a"));// 2
	
	
	String s3 ="happy Boy";
	System.out.println(s3.indexOf("p"));// 2
	System.out.println(s3.lastIndexOf("p"));//3
	
}

}
