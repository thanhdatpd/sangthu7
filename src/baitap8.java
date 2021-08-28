import java.util.Scanner;
import java.lang.*;

public class baitap8 {
    public static Integer nam;

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner input = new Scanner(System.in);
        System.out.println("Bai tap 8:");

        System.out.print("Nhập năm để kiểm tra: ");
        nam = Integer.parseInt(input.nextLine());

        if (nam % 4 == 0 && nam % 100 != 0) {
            System.out.printf("\n\nKết quả: %d là năm nhuận \n", nam);
        } else {
            System.out.printf("\n\nKết quả: %d không phải năm nhuận \n", nam);
        }
    }
}
