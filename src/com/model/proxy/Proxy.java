package com.model.proxy;

public class Proxy implements AbstractSubject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest(){
        System.out.println("访问真实主题前的预处理");
    }

    private void postRequest(){
        System.out.println("访问真实主题后的后续处理");
    }
}
