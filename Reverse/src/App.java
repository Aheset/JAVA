
//ctrl shift o ==> to import Scanner
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// create scanner object
		Scanner input = new Scanner(System.in);

		// output the prompt
		System.out.println("Enter number to be reversed");

		// wait for the user to enter number
		int userInput = input.nextInt();
		System.out.println("Entered number is : " + userInput);
		int remainder = 0;
		int reversed = 0;

		// while loop==> loops till userInput equals zero
		while (userInput != 0) {
			remainder = userInput % 10; /* to get the last number we get the remainder by using the modular(%),
										   and append it to the reversed*/
			userInput = userInput / 10; // to shrink by one digit, divide by 10
			reversed = reversed * 10 + remainder;/*shifting the number by one digit(adding zero) 
													and add the remainder to get the reversed*/
		}

		System.out.println("Reversed number is : " + reversed);
	}
}
