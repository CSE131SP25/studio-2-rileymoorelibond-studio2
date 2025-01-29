package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("What amount of money did I start with?");
		double startAmount = input.nextDouble(); 
		
		System.out.println("What is the chance that you win a game?");
		double winChance =  input.nextDouble() ;
		
		System.out.println("What is your win limit?");
		int winLimit = input.nextInt();
		
		
		
		
	}

}
