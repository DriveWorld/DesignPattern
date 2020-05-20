package com.model.main;

import com.model.singleton.President;

public class Main {
    public static void main(String[] args) {
        President p1 = President.getInstance();
        p1.getName();
        President p2 = President.getInstance();
        p2.getName();
    }
}
