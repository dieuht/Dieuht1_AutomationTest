package company;

import Person.person;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
        ArrayList<person> arrayPerson = new ArrayList<>();
        person p1 = new person("Sam", 25, "Nữ");
        person p2 = new person("Tôm", 29, "Nam");
        person p3 = new person("Tép", 27, "Nam");

        arrayPerson.add(p1);
        arrayPerson.add(p2);
        arrayPerson.add(p3);

        System.out.println("Các thông tin được public: ");
        for (person p : arrayPerson) {
            p.getInfo();
        }
    }
}
