package Baitap.Buoi5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayToArrayList {

    public static void main(String[] args) {
        // ArrayList declaration
        ArrayList<Integer> list = new ArrayList<>();
        int y = 0;
        for(int i = 0; i<=50; i++){
            if(i%2 == 0){
                list.add(i);
                y++;
            }
        }
        for (int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
