import java.util.Scanner;

public class FactorialNumber {
    static int factorial(int n) {
		if (n == 0) 
			return 1;
		else
			return (n * factorial(n-1));
	}

	public static void main(String[] args) {
		
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();   
		
		fact = factorial(n);
		System.out.println("Factorial of " + n + " is : " + fact);
	}
}
