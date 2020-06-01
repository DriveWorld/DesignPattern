package com.model.brideg;

public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
