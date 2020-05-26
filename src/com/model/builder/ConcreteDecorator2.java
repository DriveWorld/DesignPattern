package com.model.builder;

public class ConcreteDecorator2 extends Decorator {
    @Override
    public void buildWall() {
        product.setWall("wall2");
    }

    @Override
    public void buildTV() {
        product.setTV("TV2");
    }

    @Override
    public void buildSofa() {
        product.setSofa("sofa2");
    }
}
