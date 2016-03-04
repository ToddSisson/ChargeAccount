package num5;

import java.util.Scanner;
import java.io.*;

public class ChargeAccountProgram {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		File file = new File("ChargeAccountNumbers.txt");
		Scanner inputFile = new Scanner(file);
		
		int[] accounts = new int[18];
		
		for (int x = 0; inputFile.hasNext() && x < accounts.length; x++){
			accounts[x] = inputFile.nextInt();
		}
		
		System.out.print("Enter an account number: ");
		int number = input.nextInt();
		
		if(ChargeAccount.checkAccounts(accounts, number))
			System.out.println("The number is valid.");
		else
			System.out.println("The number is invalid.");
		
		inputFile.close();
		input.close();

	}

}
