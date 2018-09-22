import java.util.Scanner;

public class RevString {
	public static void main(String []ags) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String to print in reverse order");
		String str = sc.nextLine();
		int len = str.length();
		String rev = "";
		for(int i = len-1;i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println("reverse of string is: "+rev);
		
		
		//buffer
		
		StringBuffer sf = new StringBuffer();
		String s1 = sf.toString();
		System.out.println("reverse with buffer function: "+sf.reverse());
		
	}

}
