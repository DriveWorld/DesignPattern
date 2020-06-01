package com.model.main;

import com.model.abstractFactory.Animal;
import com.model.abstractFactory.Farm;
import com.model.abstractFactory.Plant;
import com.model.adapter.Adapter;
import com.model.adapter.Motor;
import com.model.adapter.ObjectAdapter;
import com.model.adapter.Target;
import com.model.brideg.Abstraction;
import com.model.brideg.ConcreteImplementorA;
import com.model.brideg.Implementor;
import com.model.brideg.RefinedAbstraction;
import com.model.builder.Decorator;
import com.model.builder.Parlour;
import com.model.builder.ProjectManager;
import com.model.factory.AbstractFactory;
import com.model.factory.Product;
import com.model.proxy.Proxy;
import com.model.utils.ReadXML;

public class Main {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
