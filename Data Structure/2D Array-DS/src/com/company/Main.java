package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> list = new ArrayList<>();

    static int hourglassSum(int[][] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                list.add(arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);

            }
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {

        int[][] a = new int[6][6];
        for(int i =0; i<6; i++){
            for(int j=0; j<6; j++){
                a[i][j] = sc.nextInt();
            }

        }
        System.out.println(hourglassSum(a));

    }
}