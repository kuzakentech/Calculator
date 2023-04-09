import java.util.*;

public class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int output;

		boolean loop = true; // Loop the whole program.
		boolean confLoop = false; // Loop the confirmation statement. This will only activated when entered valid operator.

		do {
			try {
				System.out.print("Enter first number: ");
				int num1 = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter second number: ");
				int num2 = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter operator: ");
				String operator = sc.nextLine();

				switch (operator.toLowerCase()) {
					case "addition":
						output = num1 + num2;
						System.out.println(num1 + " + " + num2 + " = " + output);
						confLoop = true;
						break;

					case "subtraction":
						output = num1 - num2;
						System.out.println(num1 + " - " + num2 + " = " + output);
						confLoop = true;
						break;

					case "multiplication":
						output = num1 * num2;
						System.out.println(num1 + " * " + num2 + " = " + output);
						confLoop = true;
						break;

					case "division":
						output = num1 / num2;
						System.out.println(num1 + " / " + num2 + " = " + output);
						confLoop = true;
						break;

					case "modulus":
						output = num1 % num2;
						System.out.println(num1 + " % " + num2 + " = " + output);
						confLoop = true;
						break;

					default:
						System.out.println("You entered invalid operator!");
						break;
				}

				while (confLoop) {
					System.out.print("Would you like to try again? (yes/no): ");
					String conf = sc.nextLine();

					if (conf.equalsIgnoreCase("yes")) {
						confLoop = false; // Terminate the confirmation loop to loop the program again.
					} else if (conf.equalsIgnoreCase("no")) {
						System.out.println("Program Terminated!");
						confLoop = false; // End of the confirmation loop.
						loop = false; // End of the program.
					} else {
						System.out.println("You entered invalid input, please type yes or no.");
					}
				}

			} catch (Exception e){
				System.out.println("You entered invalid input, please try again.");
				sc.nextLine(); // This is to avoid infinite statement of "You entered invalid input, please try again.".
			}
		} while (loop);
	}
}
