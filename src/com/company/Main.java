package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang vao day");
        int size = sc.nextInt();
        int array[] = new int[size];
        // nhap phan tu mang
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phan tu mang thu " + i + "vao day");
            array[i] = sc.nextInt();
        }
        // in mang da nhap
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // dao nguoc phan tu mang
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
