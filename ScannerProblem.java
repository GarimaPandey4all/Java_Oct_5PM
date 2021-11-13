import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerProblem {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter an Integer");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter your name");
		String name = br.readLine();
		
		System.out.println("You have entered:"+a+" "+name);
		
	}

}
