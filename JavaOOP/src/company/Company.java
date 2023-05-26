package company;

import Person.person;

public class Company {
    public static void main(String[] args) {
        person p2 = new person("Sam", 25, "Nữ");
        System.out.println("Các thông tin được public: ");
        p2.getInfo();
    }
}
