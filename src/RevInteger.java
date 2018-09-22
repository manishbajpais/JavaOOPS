import java.util.Scanner;

public class RevInteger {
	public static void main(String []args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter any integer");
		long a = sc1.nextInt();
		int rev = 0;
		while(a!=0) {
			rev = (int) (rev*10+a%10);
			a = a/10;
			
		}
		System.out.println(rev);
		
		//String buffer reverse
		long sc2 = 123456;
		System.out.println(new StringBuffer(String.valueOf(sc2)).reverse());
		
	}

}

