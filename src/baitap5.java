import java.util.Scanner;
import java.lang.*;

public class baitap5 {
    public static String tenSanPham = "";
    public static Integer donGia = 21;
    public static Integer soLuong = 0;
    public static Double thueNhapKhau;

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner input = new Scanner(System.in);
        System.out.println("Bai tap 5:");

        System.out.print("Nhập tên sản phẩm: ");
        tenSanPham = input.nextLine();

        System.out.print("Nhập đơn giá: ");
        donGia = Integer.parseInt(input.nextLine());

        System.out.print("Nhập số lượng: ");
        soLuong = Integer.parseInt(input.nextLine());

        thueNhapKhau = (donGia * soLuong) * 0.1;

        System.out.println("\n\nKết quả:");
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Số lượng: " + soLuong);
        System.out.printf("Thuế nhập khẩu: %.2f \n", thueNhapKhau);
    }
}
