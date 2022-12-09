package String_class;
// String Class Methods/Functions - replace() 
public class StringClassMethodsReplace
{
public static void main(String[] args)
{
	String s1 = "My name is Rahul";
	System.out.println(s1.replace("Rahul", "Pritesh")); //My name is Pritesh
	System.out.println(s1.replace("rahul", "Pritesh")); //My name is Rahul
	System.out.println(s1.replace("Rahul", "Akshay")); //My name is Akshay
	
	
	String s2 = "I am fine and right now";

	System.out.println(s2.replace("fine", "ok")); //I am ok and right now
	
	
	
}

}
