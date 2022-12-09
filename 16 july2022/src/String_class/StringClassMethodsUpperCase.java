package String_class;
// String Class Methods/Functions - toUpperCase()
public class StringClassMethodsUpperCase 
{
public static void main(String[] args)
{
	String s1 = "velocity";
	
	System.out.println(s1.toUpperCase());  //VELOCITY  // temporary variable
	
	System.out.println( "-------------------");
	s1 =s1.toUpperCase(); // Permenant change 
	System.out.println(s1);//VELOCITY
	System.out.println( "-------------------");
	
	String s2= "Pritesh";
	System.out.println(s2.toUpperCase()); // PRITESH
	
	String s3= "PRiya is a girl";
	System.out.println(s3.toUpperCase());// PRIYA
	
	
	String s4= "1. String is non-primitive data type, memory size is not fixed.\n"
			+ "	2. String is use to store collection of characters.\r\n"
			+ "	3. String is a inbuilt/ready made class present inside \"java.lang\" package.\r\n"
			+ "	4. String class is final class can't be inherited to other classes.\r\n"
			+ "	5. At the time of String declaration, initialization, object creation takes place.\r\n"
			+ "	6. String objects are immutable in nature/can't be change";
	System.out.println(s4.toUpperCase()); // HAPPY
	
	
}
}
