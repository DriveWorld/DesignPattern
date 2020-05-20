package com.model.singleton.singleton_eager;

/**
 * 此处是饿汉单例模式应用
 * */
public class Pig {
    private static final Pig instance = new Pig();

    private Pig(){
        System.out.println("产生一个天蓬元帅");
    }

    public static Pig getInstance(){
        return instance;
    }
}
