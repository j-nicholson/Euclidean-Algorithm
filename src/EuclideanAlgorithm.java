import java.util.Scanner;

public class EuclideanAlgorithm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers a,b to find their gcd using the Euclidean Algorithm: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int gcd = euclideanGCD(a, b);
		System.out.printf("The computed GCD is %d", gcd);
		scan.close();
		
	}
	
	public static int euclideanGCD(int a, int b) {
		int x = a;
		int y = b;
		
		while(y != 0) {
			int remainder = x % y;
			x = y;
			y = remainder;
		}
		
		return x;
	}

}
