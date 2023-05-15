package JavaBasic4;

public class For_Array {
    public static void main(String[] args) {
        int a[] = new int[26];
        System.out.println("Danh sách số chẵn từ 0-50 là: ");
        for (int i=0; i<=50; i++){
            if (i%2==0){
                System.out.println(i);
                a[i/2] = i;
            }
        }
        System.out.println("Duyệt mảng in ra danh sách đã lưu trong mảng: ");
        for (int j:a){
            System.out.println(j);
        }
    }
}
