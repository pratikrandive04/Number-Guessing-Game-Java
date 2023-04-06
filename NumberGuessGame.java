package numberGuessGame;

import java.util.Random;

import java.util.Scanner;

class GuessNumber{
	int number;
	
	public GuessNumber() {
		Random random = new Random();
		number = random.nextInt(50);
	}
	
	void doGuess() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println();
			System.out.println("Guess Number: "+(i+1));
			System.out.print("Enter Your Number: ");
			int num = sc.nextInt();
			if (Math.abs(number-num)==0) {
				System.out.println("Hey Correct Guess! You Win The Game!");
				break;
			}
			if (Math.abs(number-num)<=5) {
				System.out.println("You Are Too Close!");
			}
			if (5<Math.abs(number-num)&&Math.abs(number-num)<=10) {
				System.out.println("Your Guess Is Medium");
			}
			if (10<Math.abs(number-num)&&Math.abs(number-num)<=15) {
				System.out.println("Your Guess Is Far");
			}
			if (15<Math.abs(number-num)&&Math.abs(number-num)<=25) {
				System.out.println("Your Guess Is Too Far");
			}
		}
		System.out.println("Game Over!");
		System.out.println("Number Was: "+number );
	}
}

public class NumberGuessGame {
	public static void main(String[] args) {
		System.out.println("Note: Maximun 10 Guesses Are Allowed");
		GuessNumber g1 = new GuessNumber();
		g1.doGuess();
	}
}
