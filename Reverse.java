/* Source written just to write something -- Takes input and reverses the entire input */
/* Written by G Colburn -- 2016 */


import static java.lang.System.in;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		boolean a = false; // For the loop, never changes
		String input = "";
		String output = "";		
		int count;

		while (!a) {
			Scanner scan = new Scanner(in);
			System.out.print("Enter a phrase or word to be reversed (exit to quit): ");
			input = scan.nextLine();
			if (input.equals("exit")) { System.exit(0); }
			count = input.length();
			
			for (int i = (count - 1); i >= 0; i--) {
				char take = input.charAt(i);
				output = output + take;
			}
			System.out.println("The string reversed is: " + output);
			output = "";
		}
	}
  }

