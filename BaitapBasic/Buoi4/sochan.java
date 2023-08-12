package Baitap.Buoi4;

public class sochan {
    public static void main(String[] args) {

        int mang[] = new int[26];
        int y = 0;
        for(int i = 0; i<=50; i++){
            if(i%2 == 0){
                mang[y] = i;
                y++;
            }
        }
        for (int i = 0; i< mang.length; i++){
            System.out.println(mang[i]);
        }
    }
}
