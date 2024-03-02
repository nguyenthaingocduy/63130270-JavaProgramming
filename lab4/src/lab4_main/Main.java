package lab4_main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        //baitap1
	        Product sp1 = new Product();
	        Product sp2 = new Product();
	        sp1.nhap();
	        sp2.nhap();
	        sp1.xuat();
	        sp2.xuat();
	        //baitap2
	        Product sp3 = new Product("Sữa",11000,1000);
	        Product sp4 = new Product("Nước",10000);
	        sp3.xuat();
	        sp4.xuat();

	}

}
