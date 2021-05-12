package arithmatic_operation;

import java.util.Scanner;
public class GreaterNoIn2 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter two numbers ");
		int a=obj.nextInt();
		int b=obj.nextInt();
		
		if(a>b)
			System.out.println(a+" Is greater number ");
		else
			System.out.println(b+" Is Greater number ");
		

	}

}
