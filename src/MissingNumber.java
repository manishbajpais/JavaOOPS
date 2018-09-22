import java.util.Scanner;


public class MissingNumber {
	public static void main(String []args) {
		/*Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int a = Integer.parseInt(sc2.nextLine());
		String arrayNum[] = new String[a];
		System.out.println("Enterred array is: "+arrayNum);*/
		
		int a[] = {1,2,3,4,8};
		int sum = 0;
		for(int i =0;i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
		int sum1 =0;
		for(int j=0;j<=8;j++) {
			sum1 = sum1+j;
		}
		System.out.println(sum1);
		
		int diff = sum1-sum;
		System.out.println(diff);
	}

}
