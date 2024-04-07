import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
		
		int r, temp;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) 
			System.out.println("Palindrom number");
		else 
			System.out.println("Not Palindrom");
	}
}
