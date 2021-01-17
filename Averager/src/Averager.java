
import java.util.Scanner;

public class Averager {

	public static void main(String[] args) {
		
		Scanner kbInput = new Scanner(System.in);

		System.out.print("Please enter the first integer: ");
		int firstInt = kbInput.nextInt();
		System.out.println("The first integer you entered is: "+ firstInt);
		System.out.println();
		
		System.out.print("Please enter the second integer: ");
		int secondInt = kbInput.nextInt();
		System.out.println("The second integer you entered is: "+ secondInt);
		System.out.println();
		
		System.out.print("Please enter the third integer: ");
		int thirdInt = kbInput.nextInt();
		System.out.println("The third integer you entered is: "+ thirdInt);
		System.out.println();
		
		System.out.print("Please enter the fourth integer: ");
		int fourthInt = kbInput.nextInt();
		System.out.println("The fourth integer you entered is: "+ fourthInt);
		System.out.println();
		
		double average = (firstInt + secondInt + thirdInt + fourthInt) / 4.0;
		System.out.printf("The average of the four integers is %.2f", average); // formats to two decimals
		System.out.println();
		
		
kbInput.close();
	}

}