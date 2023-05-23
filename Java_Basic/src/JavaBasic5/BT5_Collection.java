package JavaBasic5;

import java.util.ArrayList;

public class BT5_Collection {
    static void data_staff(String name, String age, String university) {
        ArrayList<String> ds = new ArrayList<String>();
        ds.add(name);
        ds.add(age);
        ds.add(university);

        for (int i = 0; i < ds.size(); i++) {
            System.out.print(ds.get(i));
            if (i < ds.size() - 1) {
                System.out.print(" - ");
            }
            else if(i == ds.size()-1){
                System.out.println(".");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Danh sach nhan vien la: ");
        System.out.println();
        data_staff("Nam", "21", "Đại học Bách Khoa");
        data_staff("Anh", "25", "Đại học Quốc gia");
        data_staff("Hoa", "26", "Học viện Bưu chính");
    }
}


