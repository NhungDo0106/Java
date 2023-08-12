package Baitap.Buoi2;

public class Calculator {

    public static int Tong2songuyen(int number1, int number2){
        return number1 + number2;
    }

    public static float Tong2sothuc(float number1, float number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        System.out.println("Tổng 2 số nguyên là: " + Tong2songuyen(10, 30));
        System.out.println("Tổng 2 số thực là: "+ Tong2sothuc(2.3F, 4.7F));
    }
}
