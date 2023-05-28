package Person;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Infomation {
    public static void main(String[] args) {
        ArrayList<person> arrayPerson = new ArrayList<>();
        person p1 = new person("Sam", 25, "Nữ", "Hà Nội", "0987654321");
        person p2 = new person("Tôm", 29, "Nam", "Tiền Huân", "0911111111");
        person p3 = new person("Tép", 27, "Nam", "Ngô Quyền", "09222222222");

        arrayPerson.add(p1);
        arrayPerson.add(p2);
        arrayPerson.add(p3);

        System.out.println("Hiển thị tất cả thông tin của Person: ");
        for (person p:arrayPerson){
            p.getInfo();
        }
    }
}
