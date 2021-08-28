import java.util.Scanner;
import java.lang.*;

public class baitap1 {
    public static String maSinhVien = "";
    public static String hoTen = "";
    public static Integer tuoi = 21;
    public static Integer namSinh = 0;
    public static Double diemTrungbinh = 9.5;

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner input = new Scanner(System.in);
        System.out.println("Bai tap 1:");

        System.out.print("Nhập mã sinh viên: ");
        maSinhVien = input.nextLine();

        System.out.print("Nhập họ tên sinh viên: ");
        hoTen = input.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi = Integer.parseInt(input.nextLine());

        System.out.print("Nhập năm sinh: ");
        namSinh = Integer.parseInt(input.nextLine());

        System.out.print("Nhập điểm trung bình: ");
        diemTrungbinh = Double.parseDouble(input.nextLine());

        System.out.println("\n\nThông tin sinh viên đã nhập:");
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Điểm trung bình: " + diemTrungbinh);

    }
}
