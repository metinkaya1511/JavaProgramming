package homework_repl_it_90_99;

import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

public class PrintTriangle_99 {
	public static void main(String[] args) {

//		Assume that the int variables i and j have been declared, 
//		and that n has been declared and initialized.
//		Using for loops (you may need more than one), 
//		write code that will cause a triangle of asterisks of size n to be output to the screen.
//
//		Example:
//		input: 5
//		output: *
//		output: **
//		output: ***
//		output: ****
//		output: *****
//
//		Example:
//		input: 3
//		output: *
//		output: **
//		output: ***
		
//		int i = 1;
//		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
//		for (int i = 1; i <= n; i++) {
//			
//			for (int j = 1; j <= i; j++) {
//				
//				System.out.println("*");
//			}
//			System.out.println();
//		}
		for(int i =1; i <=n; i++) {
			for(int j = 1; j <=i; j++) {
				
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}