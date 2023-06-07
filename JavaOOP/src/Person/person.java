package Person;

public class person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    protected String getAddress() {
        return address;
    }

    protected String getPhone() {
        return phone;
    }

    public person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public person(String name, int age, String gender, String address, String phone){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    public void getInfo(){
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
        System.out.println("Address = " + address);
        System.out.println("Phone = " + phone);
        System.out.println("-------------------------");
    }
}
