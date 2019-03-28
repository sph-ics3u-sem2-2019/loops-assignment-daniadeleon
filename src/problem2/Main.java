package problem2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in two numbers. Add up all the values between them
		Scanner in=new Scanner(System.in);
		int counter=1;
		int max=1;
		System.out.println("Give me the first number");
		counter=in.nextInt();
		System.out.println("Give me the second number");
		max=in.nextInt();
		int total=0;
		while (counter<=max) { 
				System.out.println(counter);
				total=total+counter;
				counter++;
	}
		System.out.println("total is "+total);
	}
}
