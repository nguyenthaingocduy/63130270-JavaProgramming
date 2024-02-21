package lab2;
import java.util.Scanner;
public class lab2_bai3 {
	public static void main(String[] rags) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so dien su dung trong thang: ");
		int soDien = scanner.nextInt();
		int tien;
		if(soDien<50) {
			tien = soDien*1000;
		}else {
			tien = 50*1000+(soDien-50)*1200;
		}
		System.out.println("Tien dien phai tra la: "+ tien + "VND");
		scanner.close();
	}
}
