import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> mainArray = new ArrayList<>();
		String cont = "y";
		while (cont.equals("y")) {
			System.out.println("Please enter a number between 1 and 100 to get the prime number in that spot.");
			int userInput = scan.nextInt();
			if (userInput <= 100 && userInput >= 1) {
				mainArray = generatePrimes();
				System.out.println("The prime number is: " + mainArray.get(userInput - 1));
				System.out.println("Would you like to continue? (y/n): ");
				cont = scan.next();
			}
			else {
				System.out.println("Please enter a valid number...");
			}
		}
		System.out.println("Goodbye!");
		scan.close();
	}

	static ArrayList<Integer> generatePrimes() {
		ArrayList<Integer> primeNums = new ArrayList<>();
		primeNums.add(2);
		int count = primeNums.size();
		int nextPrime = 3;

		while (count != 100) {

			boolean isPrime = true;

			for (int i = 0; i < primeNums.size(); i++) {
				if (nextPrime % primeNums.get(i) == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				primeNums.add(nextPrime);
			}
			nextPrime++;
			count = primeNums.size();
		}
		return primeNums;

	}

}