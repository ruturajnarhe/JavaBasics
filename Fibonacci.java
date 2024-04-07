import java.util.Scanner;

public class Fibonacci {
    static void printFibonacciSeries(int n) {
		
		int FT = 0, ST = 1;
		
		for (int i = 0; i < n; i++) {
			System.out.println(FT + " ");
			int NT = FT + ST;
			FT = ST;
			ST = NT;
		}
	}
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter count number : ");
		int count = sc.nextInt();
		
		System.out.println("Fibonacci Series : ");
		printFibonacciSeries(count);
	}
}
