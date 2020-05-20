package com.model.singleton.singleton_eager;

public class Pig {
    private static final Pig instance = new Pig();

    private Pig(){
        System.out.println("产生一个天蓬元帅");
    }

    public static Pig getInstance(){
        return instance;
    }
}
