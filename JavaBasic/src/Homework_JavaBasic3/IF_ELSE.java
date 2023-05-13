package Homework_JavaBasic3;

public class IF_ELSE {
    static int number = 100;
    static void SoSanh(int n){
        if (n == number){
            System.out.println("n = number");
        }
        else if (n < number){
            System.out.println("n < number");
        }
        else {
            System.out.println("n > number");
        }
    }

    public static void main(String[] args) {
        SoSanh(100);
    }
}
