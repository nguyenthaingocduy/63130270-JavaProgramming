package lab2;
import java.util.Scanner;
public class lab2_bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		System.out.println("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		System.out.println("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.println("Phuong trinh vo so nghiem.");
				}else {
					System.out.println("Phuong trinh vo nghiem.");
				}
			}
			else {
				double x = -c/b;
				System.out.println("Phuong trinh co mot nghiem: x = "+ x);
			}
		}
		else {
			double delta = b * b - 4 * a * c;
			if(delta < 0) {
				System.out.println("Phuong trinh vo nghiem.");
			}else if(delta == 0){
				double x = -b/(2*a);
				System.out.println("Phuong trinh co nghiem kep: x = " + x);
			}else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
			}
		}
		scanner.close();
		}
}
