package Baitap.Buoi3;

public class ifelse {

    private static int so(int n){

        if(n == 100){
            System.out.println("gia tri 100");
        }
        else if(n< 100){
            System.out.println("gia tri lon nho hon 100");
        }
        else {
            System.out.println("gia tri lon lon hon 100");
        }
        return n;
    }
    public static void main(String[] args) {
        int number = 200;
        ifelse.so(number);

    }

}
