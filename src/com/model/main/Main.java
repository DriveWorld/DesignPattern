package com.model.main;

import com.model.singleton.singleton_eager.Pig;
import com.model.singleton.singleton_lazy.President;

public class Main {
    public static void main(String[] args) {
        President p1 = President.getInstance();
        p1.getName();
        President p2 = President.getInstance();
        p2.getName();

        Pig pig1 = Pig.getInstance();
        Pig pig2 = Pig.getInstance();

        if (pig1 == pig2){
            System.out.println("同一个八戒");
        }else{
            System.out.println("不同的八戒");
        }
    }
}
