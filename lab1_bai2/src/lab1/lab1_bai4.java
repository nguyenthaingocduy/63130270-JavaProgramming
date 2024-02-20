package lab1;

import java.util.Scanner;

public class lab1_bai4 {
	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập hệ số a: ");
		double a = scanner.nextDouble();	
		System.out.println("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		System.out.println("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		double delta = Math.pow(b,2)-4*a*c;
		System.out.println("Delta là: "+ delta + "\n");
		if(delta>0) {
			double sqrtDelta = Math.sqrt(delta);
			System.out.println("delta là: " + sqrtDelta);
		}
		else {
			System.out.println("Phương trình vô nghiệm");
		}
	}
}
