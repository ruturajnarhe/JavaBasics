import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
		
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string/number : ");
		String original = sc.nextLine();
		
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrom");
		else
			System.out.println("Entered string/number isn't a palindrom");
	}

}
