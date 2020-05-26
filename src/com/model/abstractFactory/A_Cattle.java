package com.model.abstractFactory;

public class A_Cattle implements Animal {

    public A_Cattle(){
        System.out.println("产生一头牛");
    }
    @Override
    public void show() {
        System.out.println("展示新出现的牛");
    }
}
