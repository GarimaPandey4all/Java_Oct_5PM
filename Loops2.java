
public class Loops2 {
	
	public static void main(String[] args) {
		
		//Labelled Loop
		
		label1: for(int i = 1; i <= 5; i++)
		{
			label2: for(int j = 1; j <= 5; j++) {
				
				System.out.print(i);
				
				if(j == 5)
				{
					break label1;
				}
				
			}
			
			System.out.println();
		}
	}

}
