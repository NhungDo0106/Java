package BaitapOOP.Buoi1;

public class Thongtinnhanvien {
    public static void main(String[] args) {
        NhanVien nhanvien1 = new NhanVien();
        System.out.println("MNV: "+ nhanvien1.getMaNV());
        System.out.println("Họ và tên: "+ nhanvien1.getHoTen());
        System.out.println("Tuổi: "+ nhanvien1.getAge());
        System.out.println("Địa chỉ: "+ nhanvien1.getAddress());
        System.out.println("SDT: "+ nhanvien1.getNumber());
        System.out.println("Email: "+ nhanvien1.getEmail());
    }
}
