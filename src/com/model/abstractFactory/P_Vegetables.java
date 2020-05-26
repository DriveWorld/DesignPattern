package com.model.abstractFactory;

public class P_Vegetables implements Plant{
    public P_Vegetables(){
        System.out.println("产生一种新的蔬菜");
    }

    @Override
    public void show() {
        System.out.println("展示产生的蔬菜");
    }
}
