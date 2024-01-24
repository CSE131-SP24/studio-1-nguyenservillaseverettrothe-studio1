package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What year do you want to check?");
		int x = in.nextInt();
		
		boolean isOrdered = (x%4==0 && x%100!=0) || (x%400==0);
		
		System.out.print(x + " is a leap year: " + isOrdered);

	}

}
