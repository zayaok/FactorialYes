import java.util.Scanner;

public class FactorialCalc {

	public static void main(String[] args) {
		
		//Welcome the user
		System.out.println("Welcome to the Factorial Calculator! Factorials are fun and informative!");
		
		//Space
		System.out.println();
		
		//Create Scanner
		Scanner s = new Scanner(System.in);
		
		//User Prompt
		System.out.println("Enter an integer that's greater than 0 but less than 10: ");
		int n = s.nextInt();
		
		//Creating continue 
		String cont = "y";
		
		
		//While loop
		while (cont.equalsIgnoreCase("Y"));
		
		
		//for loop
		for (int i = 0;i <= n; i++) {
			System.out.println(i * i - 1 );
		}
		
		
		} 

	//Factorial formula
		/*	public static long factorial(int n){ 
			    if (n == 1) return 1; 
			    return n * factorial(n-1); 
	}*/

}