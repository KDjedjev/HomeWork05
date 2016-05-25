package task02;

import java.util.Scanner;

public class Main {

	static void printGr() {
		System.out.print("Greeting ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Your name is: ");
		String firstName = input.nextLine();
		printGr();
		System.out.print(firstName);
	}
}
