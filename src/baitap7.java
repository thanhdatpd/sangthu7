import java.util.Scanner;
import java.lang.*;

public class baitap7 {
    public static Double diemToan;
    public static Double diemLy;
    public static Double diemHoa;
    public static Double diemTrungBinh;

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner input = new Scanner(System.in);
        System.out.println("Bai tap 7:");

        System.out.print("Nhập điểm Toán: ");
        diemToan = Double.parseDouble(input.nextLine());
        System.out.print("Nhập điểm Lý: ");
        diemLy = Double.parseDouble(input.nextLine());
        System.out.print("Nhập điểm Hoá : ");
        diemHoa = Double.parseDouble(input.nextLine());

        diemTrungBinh = ((diemToan * 3) + (diemLy * 2) + diemHoa) / 6;

        System.out.println("\n\nKết quả tính toán:");
        System.out.printf("Điểm trung bình 3 môn là: %.1f  \n", diemTrungBinh);
    }
}
