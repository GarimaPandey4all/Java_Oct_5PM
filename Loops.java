
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int days[] = {31, 29, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
		
//		for(int i = 0; i < days.length; i++)
//		{
//			System.out.println(days[i]);
//		}
			
		//foreach loop or enhanced loop
		for(int month : days)
		{
			System.out.println(month);
		}
		
	}

}
