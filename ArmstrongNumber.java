import java.util.Scanner;

public class ArmstrongNumber {
    static boolean isArmstrong(int n) {
		int temp, digits = 0, last = 0, sum = 0;
		temp = n;
		
		while(temp > 0) {
			temp = temp / 10;
			digits ++;
		}
		temp = n;
		while (temp > 0) {
			last = temp % 10;
			
			sum += (Math.pow(last, digits));
			
			temp = temp / 10;
		}
		if (n == sum) 
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int n = sc.nextInt();
		
		System.out.println("Armstrong Number up to " + n + " are : ");
		for (int i = 0; i <= n; i++) {
			if (isArmstrong(i))
				System.out.print(i + ", ");
		}
	}
}
