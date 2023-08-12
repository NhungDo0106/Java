package BaitapOOP.Buoi2.Person;

public class Person {

    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    protected void getInfo() {
        System.out.println("Ten: " + getName());
        System.out.println("Tuoi: " + getAge());
        System.out.println("Gioi tinh: " + getGender());
        System.out.println("Dia chi: " + getAddress());
        System.out.println("SDT: " + getPhone());
    }

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected  String getPhone() {
        return phone;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    public void getInfoCompany(){
        System.out.println("Ten: " + getName());
        System.out.println("Tuoi: " + getAge());
        System.out.println("Gioi tinh: " + getGender());
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
