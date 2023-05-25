package JavaOOP_1;

import java.util.ArrayList;

public class ThongTin {
    public static void main(String[] args) {

        NhanVien nv1 = new NhanVien("Hoa", 25, "Hà Nội", "Kế toán");
        NhanVien nv2 = new NhanVien("Nam", 27, "Nha Trang", "Tổng hợp");
        NhanVien nv3 = new NhanVien("Long", 33, "Hà Nội", "Tài Chính");
        NhanVien nv4 = new NhanVien("Bắc", 35, "Nghệ An", "Công Nghệ");

        nv1.print();
        nv2.print();
        nv3.print();
        nv4.print();
    }
}
