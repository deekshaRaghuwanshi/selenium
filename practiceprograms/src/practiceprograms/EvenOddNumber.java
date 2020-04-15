package practiceprograms;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {

		// find given number is even or odd 

		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		if(a%2==0) {
			System.out.println("Given number is even");
		}
		else 
		{
			System.out.println("Given number is odd");
		}
		System.out.println(sc);

	}

}
