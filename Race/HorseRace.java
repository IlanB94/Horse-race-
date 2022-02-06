package Race;
import java.util.Scanner;

public class HorseRace {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Create finishing line object
		FinishingLine f1 = new FinishingLine();
		// Get the range from the user
		System.out.println("Please enter the range: ");
		int range = scanner.nextInt();
		// Create Horses
		Horse horse1 = new Horse("One", f1, range);
		Horse horse2 = new Horse("Two", f1, range);
		Horse horse3 = new Horse("Three", f1, range);
		Horse horse4 = new Horse("Four", f1, range);
		Horse horse5 = new Horse("Five", f1, range);
		Horse horse6 = new Horse("Six", f1, range);
		Horse horse7 = new Horse("Seven", f1, range);
		Horse horse8 = new Horse("Eight", f1, range);
		Horse horse9 = new Horse("Nine", f1, range);
		Horse horse10 = new Horse("Ten", f1, range);
		// Use threads
		Thread th1 = new Thread(horse1);
		Thread th2 = new Thread(horse2);
		Thread th3 = new Thread(horse3);
		Thread th4 = new Thread(horse4);
		Thread th5 = new Thread(horse5);
		Thread th6 = new Thread(horse6);
		Thread th7 = new Thread(horse7);
		Thread th8 = new Thread(horse8);
		Thread th9 = new Thread(horse9);
		Thread th10 = new Thread(horse10);

		// Start the threads
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		th8.start();
		th9.start();
		th10.start();

	}
}