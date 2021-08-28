import java.util.Scanner;
import java.lang.*;

public class baitap4 {
    public static Double heSoThu1;
    public static Double heSoThu2;
    public static Double heSoThu3;

    public static Double delta;
    public static Double canCelta;

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner input = new Scanner(System.in);
        System.out.println("Bai tap 4:");

        System.out.print("Nhập hệ số thứ 1: ");
        heSoThu1 = Double.parseDouble(input.nextLine());
        System.out.print("Nhập hệ số thứ 2: ");
        heSoThu2 = Double.parseDouble(input.nextLine());
        System.out.print("Nhập hệ số thứ 3: ");
        heSoThu3 = Double.parseDouble(input.nextLine());

        delta = Math.pow(heSoThu2, 1) + heSoThu1 + heSoThu3;
        canCelta = Math.sqrt(delta);

        System.out.println("\n\nKết quả tính toán:");
        System.out.printf("Delta: %.2f", delta);
        System.out.printf("Căn delta: %.2f \n", canCelta);
    }
}
