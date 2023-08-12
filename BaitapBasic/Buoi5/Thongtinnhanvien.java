package Baitap.Buoi5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Thongtinnhanvien {

    public static void main(String[] args) {
        Map<String, String> thongtinnhanvien = new HashMap<>();
        thongtinnhanvien.put("MNV", "001");
        thongtinnhanvien.put("Ten", "Nguyen Van A");
        thongtinnhanvien.put("NamSinh", "2000");
        thongtinnhanvien.put("Diachi", "Can Tho");
        thongtinnhanvien.put("Sodienthoai", "0123456789");
        thongtinnhanvien.put("Email", "nva@gmail.com");

        thongtinnhanvien.forEach((key, value) -> {
            System.out.println(value);
        });

    }
}
