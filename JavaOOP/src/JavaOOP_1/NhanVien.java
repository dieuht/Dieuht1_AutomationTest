package JavaOOP_1;

class NhanVien {
    private String name;
    private int age;
    private String address;
    private String department;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }
    //Hàm xây dựng - contructor
    public NhanVien(String name, int age, String address, String department){
        this.name = name;
        this.age = age;
        this.address = address;
        this.department = department;
    }
    void print(){
        System.out.println("Tên Nhân viên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Lớp học: " + department);
        System.out.println("--------------------------");
        //return "Tên Nhân viên: " + name + " Tuổi: " + age + "Địa chỉ: " + address + "Lớp học: " + department;
    }

}
