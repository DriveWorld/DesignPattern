package com.model.proxy;

public class RealSubject implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("访问真实主题的方法");
    }
}
