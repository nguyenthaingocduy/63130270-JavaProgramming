package lab2;
import java.util.Scanner;
public class lab2_bai1 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		System.out.println("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		double x = -b/a;
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình vô số nghiệm");
			}
			else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else {
			System.out.println("Nghiệm của phương trình là: "+ x);
		}
	}
}
