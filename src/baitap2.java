import java.util.Scanner;
import java.lang.*;

public class baitap2 {
    public static Integer soX = 0;
    public static Integer soY = 0;

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner input = new Scanner(System.in);
        System.out.println("Bai tap 2:");

        System.out.print("Nhập số nguyên x: ");
        soX = Integer.parseInt(input.nextLine());
        System.out.print("Nhập số nguyên y: ");
        soY = Integer.parseInt(input.nextLine());

        System.out.println("\n\nKết quả tính toán:");
        System.out.println("Tổng: " + (soX + soY));
        System.out.println("Hiệu: " + (soX - soY));
        System.out.println("Tích: " + (soX * soY));
        System.out.println("Phần dư X chia Y: " + (soX % soY));
    }
}
