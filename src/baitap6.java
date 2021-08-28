import java.util.Scanner;
import java.lang.*;

public class baitap6 {
    public static Double banKinh;
    public static Double dienTich;
    public static Double chuVi;

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner input = new Scanner(System.in);
        System.out.println("Bai tap 6:");

        System.out.print("Nhập bán kính hình tròn: ");
        banKinh = Double.parseDouble(input.nextLine());

        dienTich = Math.PI * Math.pow(banKinh, 2);
        chuVi = (banKinh * 2) * Math.PI;

        System.out.println("\n\nKết quả tính toán:");
        System.out.printf("Diện tích: %.2f \n", dienTich);
        System.out.printf("Chu vi: %.2f \n", chuVi);
    }
}
