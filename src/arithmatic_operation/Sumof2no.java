package arithmatic_operation;

import java.util.Scanner;

public class Sumof2no {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter first no. : ");
		int i=a.nextInt();
		
		System.out.println("Enter second no. : ");
		int j=a.nextInt();
		
		int s = i+j;
		
		System.out.println("Sum of "+i+" and "+j+" is : "+s);

	}

}
