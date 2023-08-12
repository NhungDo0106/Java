package BaitapOOP.Buoi2;

public class Person {

    public String name = "Hoa";
    public int age = 25;
    public String gender = "Nữ";
    private String address = "Can Tho";
    private String number = "0123456789";

    public void getPersonPublic(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(address);
        System.out.println(number);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    private String getAddress(){
        return address;
    }

    private String getNumber(){
        return number;
    }


}
