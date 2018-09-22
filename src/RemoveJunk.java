import java.util.Scanner;

public class RemoveJunk {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to remove junk: ");
		String s1 = sc.nextLine();
		//regular expression [^a-zA-Z0-9]
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
	}

}
