package arithmatic_operation;

import java.util.Scanner;
public class Sumof3no {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter three numbers : ");
		int i=obj.nextInt();
		int j=obj.nextInt();
		int k=obj.nextInt();
		
		System.out.println("Sum of "+i+", "+j+" and "+k+" is : "+(i+j+k));
		

	}

}
