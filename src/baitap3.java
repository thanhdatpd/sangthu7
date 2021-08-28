import java.util.Scanner;
import java.lang.*;

public class baitap3 {
    public static Double chieuDai;
    public static Double chieuRong;

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner input = new Scanner(System.in);
        System.out.println("Bai tap 3:");

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        chieuDai = Double.parseDouble(input.nextLine());
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        chieuRong = Double.parseDouble(input.nextLine());

        System.out.println("\n\nKết quả tính toán:");
        System.out.println("Chu vi: " + (chieuDai + chieuRong) * 2);
        System.out.println("Diện tích: " + (chieuDai * chieuRong));
        System.out.println("Cạnh nhỏ nhất: " + Math.min(Math.round(chieuDai), Math.round(chieuRong)));
    }
}
