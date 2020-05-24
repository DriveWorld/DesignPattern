package com.model.realizetype.realizetype_manager;

import java.util.Scanner;

public class Square implements Shape {
    @Override
    public Object clone() {
        Square square = null;

        try {
            square = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝正方形失败!");
        }
        return square;
    }

    @Override
    public void countArea() {
        int a = 0;

        System.out.println("这是一个正方形，请输入它的边长：");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("该正方形的面积=" + a * a + "\n");
    }
}
