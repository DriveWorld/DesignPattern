package com.model.realizetype.realizetype_manager;

import java.util.Scanner;

public class Circle implements Shape {
    @Override
    public Object clone() {
        Circle circle = null;

        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝失败");
        }
        return circle;
    }

    @Override
    public void countArea() {
        int r = 0;

        System.out.println("这是一个圆，请输入圆的半径:");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        System.out.println("该圆的面积=" + 3.14 * r * r + "\n");
    }
}
