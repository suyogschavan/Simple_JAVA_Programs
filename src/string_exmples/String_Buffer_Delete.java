package string_exmples;

public class String_Buffer_Delete {

	public static void main(String[] args) {
		
		StringBuffer n = new StringBuffer("Hello");
		n.delete(1, 2);
		System.out.println(n);
	}

}
