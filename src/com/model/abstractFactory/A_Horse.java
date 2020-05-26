package com.model.abstractFactory;

public class A_Horse implements Animal {

    public A_Horse(){
        System.out.println("产生一匹马");
    }

    @Override
    public void show() {
        System.out.println("展现新出现的马");
    }
}
