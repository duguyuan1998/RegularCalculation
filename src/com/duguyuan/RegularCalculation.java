package com.duguyuan;

import java.util.Scanner;

public class RegularCalculation {

    public static void calculation(int x) {
        int[] temps = new int[5];
        temps[0] = x;
        int sum = 2*temps[0];
        for (int i = 1; i < 5; i++) {
            temps[i] = temps[i-1] * 10 + x;
            if (i < 4) {
                sum += 2*temps[i];
            } else {
                sum += temps[i];
            }
        }
        System.out.printf("%d+%d+%d+%d+%d+%d+%d+%d+%d=%d", temps[0], temps[1], temps[2], temps[3], temps[4], temps[3], temps[2], temps[1], temps[0], sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        calculation(x);
        in.close();
    }

}
