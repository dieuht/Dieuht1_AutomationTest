package Homework_JavaBasic3;

import java.sql.SQLOutput;

public class ToanTu {
    public static void main(String[] args) {
        int point = 1000;
        int voucher = 2;
        int item_cost = 500;
        String Status = "Còn hàng";

        if ((Status.equals("Còn hàng")) && ((item_cost >= point) || (voucher > 0))) {
            if ((item_cost >= point) && (voucher == 0)){
                point = point - item_cost;
                System.out.println("Chỉ thực hiện đổi quà bằng điểm!");
                System.out.println("Số điểm còn lại là: " + point);
            }
            else if ((item_cost <point) && (voucher > 0)){
                voucher = voucher - 1;
                System.out.println("Chỉ thực hiện đổi quà bằng voucher!");
                System.out.println("Số Voucher còn lại là: " + voucher);
            }
            else {
                System.out.println("Có thể đổi quà bằng điểm hoặc voucher");
            }
        } else System.out.println("Thực hiện đổi quà không thành công!");
    }
}
