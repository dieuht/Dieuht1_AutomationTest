package JavaBasic5;

import java.util.ArrayList;
import java.util.List;

public class BT5_Chinh_sua_BT4 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 1; i <= 50; i++){
            if (i%2 ==0){
                arrayList.add(i);
            }
        }
        System.out.println("Show Array: ");
        System.out.println(arrayList);
    }
}
