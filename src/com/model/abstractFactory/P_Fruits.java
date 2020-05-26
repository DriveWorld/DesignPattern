package com.model.abstractFactory;

public class P_Fruits implements Plant {
    public P_Fruits(){
        System.out.println("产生一种水果");
    }

    @Override
    public void show() {
        System.out.println("展现新产生的水果");
    }
}
