package com.model.builder;

public abstract class Decorator {
    protected Parlour product = new Parlour();
    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();

    public Parlour getResult(){
        return product;
    }
}
