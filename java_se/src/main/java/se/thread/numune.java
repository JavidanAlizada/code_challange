package se.thread;

import java.util.Arrays;

public class numune {

    public static void main(String[] args) {
        int newArr[] = new int[300];
        int[] oldArr = new int[]{3,4,5,1,32,4,23,200,13,1};
        for(int i = 0; i < 1000; i++){
            System.out.println(newArr[oldArr[i]]++);
        }
    }
}
