package BaitapOOP.Buoi1;

public class NhanVien {

        public String maNV;
        public String hoTen;
        public int age;
        public String address;
        public String number;
        public String email;

    public NhanVien(String maNV, String hoTen, int age, String address, String number, String email) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.age = age;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    public void getInfo(){
        System.out.println("MNV: " + getMaNV());
        System.out.println("Họ và tên: " + getHoTen());
        System.out.println("Tuổi: " + getAge());
        System.out.println("Địa chỉ: " + getAddress());
        System.out.println("SDT: " + getNumber());
        System.out.println("Email: " + getEmail());
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

    }

