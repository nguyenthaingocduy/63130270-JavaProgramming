package lab2;
import java.util.Scanner;
public class lab2_bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			menu();
			System.out.println("Chon chuc nang: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: 
				giaiPTB1();
				break;
			case 2:
				giaiPTB2();
				break;
			case 3:
				tinhTienDien();
				break;
			case 4:
				System.out.println("Ket thuc chuong trinh.");
				break;
			default:
				System.out.println("Chuc nang khong hop le. Vui long chon lai.");
			}
		}while(choice !=4);
			scanner.close();
	}
	public static void menu() {
		 System.out.println("+---------------------------------------------------+");
	        System.out.println("1. Giai phuong trinh bac nhat.");
	        System.out.println("2. Giai phuong trinh bac hai.");
	        System.out.println("3. Tinh tien dien.");
	        System.out.println("4. The end.");
	        System.out.println("+---------------------------------------------------+");
	}
	public static void giaiPTB1() {
		
	}
	public static void giaiPTB2() {
		
	}
	public static void tinhTienDien() {
		
	}
}
