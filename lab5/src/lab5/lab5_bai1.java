package lab5;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class lab5_bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<Double> lists = new ArrayList<Double>();
        while (true){
            System.out.print("Nhập số : ");
            double x = scanner.nextDouble();
            lists.add(x);
            System.out.print("Nhập tiếp không (Y/N) : ");
            String check = scanner.next();
            if (check.equals("N")){
                break;
            }
        }
        double tong = 0;
        for (double x : lists){
            tong+=x;
        }
        System.out.printf("Tổng là : %.2f",tong);

    }


	}


