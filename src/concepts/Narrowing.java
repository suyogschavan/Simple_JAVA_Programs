package concepts;

	import java.util.Scanner;
	public class Narrowing {
		public static void main(String srg[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter an integer value: ");
			int i=sc.nextInt();
			System.out.println("You Entered = "+i);
			char ch=(char)i;
			System.out.println("Character value of the given integer: "+ch);
		}
	}


