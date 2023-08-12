package Baitap.Buoi1;

public class Sinhvien {

    // Bien local
    public void getTen(){
        String ten = "Nhung";
        System.out.println("Ten: " + ten);
    }
    // Bien contance
    public int tuoi = 30;
    public void getTuoi() {
        System.out.println("Tuoi: " + tuoi);
    }

    // Bien static
    public static String address = "Hau Giang";

    public void getAddress() {
        System.out.println("Address: " + address);
    }

    public static void inThongTin() {
        System.out.println("Ten: " + Thongtin.ten);
        System.out.println("Tuoi: " + Thongtin.tuoi);
        System.out.println("Address: " + Thongtin.address);
    }

}
