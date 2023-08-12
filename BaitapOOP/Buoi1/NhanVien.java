package BaitapOOP.Buoi1;

public class NhanVien {

        String maNV = "001";
        String hoTen = "Nguyen Van A";
        int age = 30;
        String address = "Can Tho";
        String number = "0123456789";
        String email = "nva@gmail.com";

        public NhanVien() {
        }

        public String getMaNV() {
            return this.maNV;
        }

        public void setMaNV(String maNV) {
            this.maNV = maNV;
        }

        public String getHoTen() {
            return this.hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return this.address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getNumber() {
            return this.number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getEmail() {
            return this.email;
        }

        public void setEmail() {
            this.email = this.email;
        }

        public static void main(String[] args) {
            NhanVien nhanvien1 = new NhanVien();
            System.out.println("MNV: " + nhanvien1.getMaNV());
            System.out.println("Họ và tên: " + nhanvien1.getHoTen());
            System.out.println("Tuổi: " + nhanvien1.getAge());
            System.out.println("Địa chỉ: " + nhanvien1.getAddress());
            System.out.println("SDT: " + nhanvien1.getNumber());
            System.out.println("Email: " + nhanvien1.getEmail());
        }
    }

