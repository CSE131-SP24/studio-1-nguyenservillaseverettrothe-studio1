package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);
	System.out.println("Value for x?");
	int x = in.nextInt();
	System.out.println("Value for y?");
	int y = in.nextInt();
	
	double Mean = ((x+y)/2.0);
	
	System.out.println("Average of " + x + " and " + y + " is " + Mean + ".");
	}

}
