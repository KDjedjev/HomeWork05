import java.util.Scanner;

public class Main {

	public static int maxNumber(int a, int b) {
		if (a > b) {
			return (a);
		} else
			return (b);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("a: ");
		int num1 = input.nextInt();
		System.out.print("b: ");
		int num2 = input.nextInt();
		System.out.print("c: ");
		int num3 = input.nextInt();
		System.out.print("The maximum is : " + maxNumber(maxNumber(num1, num2), num3));
	}
}
