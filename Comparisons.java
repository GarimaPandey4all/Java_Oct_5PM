
public class Comparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//== vs equals()
		
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		
		System.out.println(s1==s2); // == : Reference Comparison
		System.out.println(s1.equals(s2)); // equals()- content comparison
		
		//equals() vs equalsIgnoreCase()
		
		String one = "hello";
		String two = "Hello";
		
		if(one.equalsIgnoreCase(two))
		{
			System.out.println("String one is equal to String two");
		}
		else {
			System.out.println("String one is not equal to String two");
		}
		
		if(one.equals(two))
		{
			System.out.println("String one is equal to String two");
		}
		else {
			System.out.println("String one is not equal to String two");
		}
		
		//compareTo(): return difference of both the string
		
//		String str1 = "Java Example";
//		String str2 = new String("Java Example");
//		String str3 = new String("Brain");
		
		String str1 = "Java Example";
		String str2 = "Java Example";
		String str3 = "Brain";
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
			
	}
}
